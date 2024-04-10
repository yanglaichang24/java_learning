# MergeSort与TimSort，ComparableTimSort

MergeSort归并排序对已经反向排好序的输入时复杂度为O(n^2)，而TimSort就是针对这种情况，对MergeSort进行优化而产生的，平均复杂度为nO(log n),最好的情况为O(n)，最坏情况nO(log n)。并且TimSort是一种稳定性排序。思想是先对待排序列进行分区，然后再对分区进行合并，看起来和MergeSort步骤一样，但是其中有一些针对反向和大规模数据的优化处理。

通过一个例子来说：ArrayList中的sort(),调用了Arrays.sort()

    @Override
    @SuppressWarnings("unchecked")
    public void sort(Comparator<? super E> c) {
        final int expectedModCount = modCount;
        Arrays.sort((E[]) elementData, 0, size, c);
        if (modCount != expectedModCount) {
            throw new ConcurrentModificationException();
        }
        modCount++;
    }

Arrays.sort()

    public static <T> void sort(T[] a, int fromIndex, int toIndex,
                                Comparator<? super T> c) {
        if (c == null) {
            sort(a, fromIndex, toIndex);
        } else {
            rangeCheck(a.length, fromIndex, toIndex);
            if (LegacyMergeSort.userRequested)
                legacyMergeSort(a, fromIndex, toIndex, c);
            else
                TimSort.sort(a, fromIndex, toIndex, c, null, 0, 0);
        }
    }

1.当Comparator == null时，调用sort(a, fromIndex, toIndex);如下

    public static void sort(Object[] a, int fromIndex, int toIndex) {
        rangeCheck(a.length, fromIndex, toIndex);
        //该分支将被删除
        if (LegacyMergeSort.userRequested)
            legacyMergeSort(a, fromIndex, toIndex);
        else
            ComparableTimSort.sort(a, fromIndex, toIndex, null, 0, 0);
    }

    /** To be removed in a future release. */
    private static void legacyMergeSort(Object[] a,
                                        int fromIndex, int toIndex) {
        Object[] aux = copyOfRange(a, fromIndex, toIndex);
        mergeSort(aux, a, fromIndex, toIndex, -fromIndex);
    }

sort方法，参数[frimeIndex, toIndex)左闭右开，采用的算法能够保证稳定性，相等元素按原来顺序排列。传入的数组部分有序则能保证事件复杂度远小于nlg(n);若完全杂乱无序，则为n；若数组中存在连续升序或降序的情况都能被很好的利用起来

（这里的稳定是指比较相等的数据在排序之后仍然按照排序之前的前后顺序排列。对于基本数据类型，稳定性没有意义，而对于对象类型，稳定性是比较重要的，因为对象相等的判断可能只是判断关键属性，最好保持相等对象的非关键属性的顺序与排序前一直；）

1） 当LegacyMergeSort.userRequested为true的情况下（该分支会在未来被弃用），采用legacyMergeSort，否则采用ComparableTimSort。

(为什么会被弃用，如一开始所说的。TimSort就应运而生，包括接下来介绍的ComparableTimSort,与前者基本相同唯一区别的是后者需要对象是Comparable可比较的，不需要特定Comparator，而前者利用提供的Comparator进行排序)

LegacyMergeSort.userRequested的字面意思大概就是“用户请求传统归并排序”的意思，通过System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
设置
mergeSort()

//To be removed in a future release.未来会弃用
@SuppressWarnings({"unchecked", "rawtypes"})
private static void mergeSort(Object[] src,
Object[] dest,
int low,
int high,
int off) {
int length = high - low;

        // Insertion sort on smallest arrays
        if (length < INSERTIONSORT_THRESHOLD) { //7
            for (int i=low; i<high; i++)
                for (int j=i; j>low &&
                         ((Comparable) dest[j-1]).compareTo(dest[j])>0; j--)
                    swap(dest, j, j-1);
            return;
        }

        // Recursively sort halves of dest into src
        int destLow  = low;
        int destHigh = high;
        low  += off;
        high += off;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, low, mid, -off);
        mergeSort(dest, src, mid, high, -off);

        // If list is already sorted, just copy from src to dest.  This is an
        // optimization that results in faster sorts for nearly ordered lists.
        //这里说的是：mid两侧的元素都是有序的，若此时src[mid-1] <=src[mid]，
          则不用在进行比较，节省时间
        if (((Comparable)src[mid-1]).compareTo(src[mid]) <= 0) {
            System.arraycopy(src, low, dest, destLow, length);
            return;
        }

        // Merge sorted halves (now in src) into dest
        for(int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && ((Comparable)src[p]).compareTo(src[q])<=0)
                dest[i] = src[p++];
            else
                dest[i] = src[q++];
        }
    }


上面的代码：当数组大小小于7时，采用插入排序，否则采用归并排序

TimSort的重要思想是分区与合并
分区
分区的思想是扫描一次数组，把连续正序列（如果是升序排序，那么正序列就是升序序列）（也就是后面所指的run），如果是反序列，把分区里的元素反转一下。 例如
1，2，3，6，4，5，8，6，4 划分分区结果为
[1,2,3,6],[4,5,8],[6,4]
然后反转反序列
[1,2,3,6],[4,5,8],[4,6]

合并
考虑一个极端的例子，比如分区的长度分别为 10000，10，1000，10，10，我们当然希望是先让10个10合并成20， 20和1000合并成1020如此下去， 如果从从左往右顺序合并的话，每次都用到10000这个数组和去小的数组合并，代价太大了。所以我们可以用一个策略来优化合并的顺序。

2） 接着上面的例子，1）的LegacyMergeSort情况说完接下来调用的是ComparableTimSort.sort

    static void sort(Object[] a, int lo, int hi, Object[] work, int workBase, int workLen) {
        assert a != null && lo >= 0 && lo <= hi && hi <= a.length;

        int nRemaining  = hi - lo;
        if (nRemaining < 2)
            return;  // Arrays of size 0 and 1 are always sorted

        // If array is small, do a "mini-TimSort" with no merges
        //当数组大小小于32是，调用“mini-TimeSort”
        if (nRemaining < MIN_MERGE) { //32
            int initRunLen = countRunAndMakeAscending(a, lo, hi);
            binarySort(a, lo, hi, lo + initRunLen);
            return;
        }
    ..........未完待续
    }


首先来分析该函数中当数组大小小于32时，调用的“mini-TimeSort”情况：

一开始调用了countRunAndMakeAscending(a, lo, hi)函数，得到一个长度initRunLen

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static int countRunAndMakeAscending(Object[] a, int lo, int hi) {
        assert lo < hi;
        int runHi = lo + 1;
        if (runHi == hi)
            return 1;

        // Find end of run, and reverse range if descending
        if (((Comparable) a[runHi++]).compareTo(a[lo]) < 0) { // Descending
            while (runHi < hi && ((Comparable) a[runHi]).compareTo(a[runHi - 1]) < 0)
                runHi++;
            reverseRange(a, lo, runHi);
        } else {                              // Ascending
            while (runHi < hi && ((Comparable) a[runHi]).compareTo(a[runHi - 1]) >= 0)
                runHi++;
        }

        return runHi - lo;
    }


该函数有啥用？数组a，求从lo开始连续的升序或降序（会被反转变成升序）的元素个数。求出的这个长度有啥用途？优化接下来调用的函数
binarySort(a, lo, lo + force, lo + runLen);代码如下

//start参数传进来的是lo+runLen，现在数组情况是a[lo, lo+runlen-1]为升序，
a[lo+runLen, hi)为乱序，该方法就是从lo+runLen开始往后一个个取出来与前面有序数组进行比较排序，
采用二分法

@SuppressWarnings({"fallthrough", "rawtypes", "unchecked"})
private static void binarySort(Object[] a, int lo, int hi, int start) {
assert lo <= start && start <= hi;
if (start == lo)
start++;
for ( ; start < hi; start++) {
Comparable pivot = (Comparable) a[start];

            // Set left (and right) to the index where a[start] (pivot) belongs
            int left = lo;
            int right = start;
            assert left <= right;
            /*
             * Invariants:
             *   pivot >= all in [lo, left).
             *   pivot <  all in [right, start).
             */
            while (left < right) {
                int mid = (left + right) >>> 1;
                if (pivot.compareTo(a[mid]) < 0)
                    right = mid;
                else
                    left = mid + 1;
            }
            assert left == right;

            /*
             * The invariants still hold: pivot >= all in [lo, left) and
             * pivot < all in [left, start), so pivot belongs at left.  Note
             * that if there are elements equal to pivot, left points to the
             * first slot after them -- that's why this sort is stable.
             * Slide elements over to make room for pivot.
             */
            int n = start - left;  // The number of elements to move
            // Switch is just an optimization for arraycopy in default case
            switch (n) {
                case 2:  a[left + 2] = a[left + 1];
                case 1:  a[left + 1] = a[left];
                         break;
                default: System.arraycopy(a, left, a, left + 1, n);
            }
            a[left] = pivot;
        }
    }


前面提到的在数组大小<32情况下，采用“mini-TimeSort”，实质是二分排序，利用countRunAndMakeAscending求得的长度来进行优化。
int start参数传进来的是lo+runLen，现在数组情况是a[lo, lo+runlen-1]为升序，a[lo+runLen, hi)为乱序，该方法就是从lo+runLen开始往后一个个取出来与前面有序数组进行比较排序，采用二分法。该函数时间复杂度为nlg(n)，不过在最坏情况下需要n^2次移动。

现在来分析数组数目>32的情况：


接着上面未完的代码
/**
* March over the array once, left to right, finding natural runs,
* extending short natural runs to minRun elements, and merging runs
* to maintain stack invariant.
*/
ComparableTimSort ts = new ComparableTimSort(a, work, workBase, workLen);
int minRun = minRunLength(nRemaining);
do {
// 找出下个分区的起始位置，方法上面介绍过
int runLen = countRunAndMakeAscending(a, lo, hi);

            // 如果run stack中的run太小, 就扩展至min(minRun, nRemaining)
            if (runLen < minRun) {
                int force = nRemaining <= minRun ? nRemaining : minRun;
                binarySort(a, lo, lo + force, lo + runLen);
                runLen = force;
            }

            // 把run放到run stack, 条件满足会进行合并
            ts.pushRun(lo, runLen);
            ts.mergeCollapse();

            // Advance to find next run
            lo += runLen;
            nRemaining -= runLen;
        } while (nRemaining != 0);

        // Merge all remaining runs to complete sort
        assert lo == hi;
        //合并剩下的run
        ts.mergeForceCollapse();
        assert ts.stackSize == 1;




我们来分析代码：首先ComparableTimSort ts = new ComparableTimSort(a, work, workBase, workLen);创建了ComparableTimSort对象


    int stackLen = (len <    120  ?  5 :
    len <   1542  ? 10 :
    len < 119151  ? 24 : 49);
    runBase = new int[stackLen];
    runLen = new int[stackLen];

构造函数里对这三个变量赋值，他们是干嘛的？

    /**
     * A stack of pending runs yet to be merged.  Run i starts at
     * address base[i] and extends for len[i] elements.  It's always
     * true (so long as the indices are in bounds) that:
     *
     *     runBase[i] + runLen[i] == runBase[i + 1]
     *
     * so we could cut the storage for this, but it's a minor amount,
     * and keeping all the info explicit simplifies the code.
     */
    private int stackSize = 0;  // run的个数，run指的是分区
    private final int[] runBase; // runBase[0]第一个分区里第一个元素下标，runBase[1]第二个分区第一个元素下标.....
    private final int[] runLen; // runLen[0]第一个分区长度...


接着调用的是minRunLength，返回的数要么小于16，要么是16，要么介于[16， 32]之间

    private static int minRunLength(int n) {
        assert n >= 0;
        int r = 0;      // Becomes 1 if any 1 bits are shifted off
        while (n >= MIN_MERGE) { //32
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

mergeCollapse：什么时候会进行合并呢？之所以进行判断是为了防止这样的情况：1000，10，100，10，10，这是五个分区的长度，最好的情况是先将小的分区合并，最后在和最大的分区合并，这个方法就是这个目的

    //后两个分区的和大于前一个分区，则中间的分区与最小的分区先合并
    //否则合并后两个分区
    private void mergeCollapse() {
    while (stackSize > 1) {
    int n = stackSize - 2;
    if (n > 0 && runLen[n-1] <= runLen[n] + runLen[n+1]) {
    if (runLen[n - 1] < runLen[n + 1])
    n--;
    mergeAt(n);
    } else if (runLen[n] <= runLen[n + 1]) {
    mergeAt(n);
    } else {
    break; // Invariant is established
    }
    }
    }


2. 当Comparable != null时，调用的方法类似
   在Comparator != null情况下主要调用了TimSort.sort，看TimSort的代码与ComparableTimSort几乎一样，只是在元素比较时用了调用者给的Comparator来进行比较。
   暂时分析到这.........
   

