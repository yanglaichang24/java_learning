package yang.sort;

import java.util.Arrays;

/**
 * <p>
 * 归并排序
 * </p>
 *
 * @author Mr.Yang
 * @desc MergeSort
 * @date 2023/5/15 16:20
 */
public class MergeSort {

    public static void main(String[] args) {
        System.out.println(3 % 5);
        int[] arr = {133, 2, 5, 55, 23, 45, 97};
        System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length < 2) return arr;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    // 有序数组的合并
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }


}
