##JCTools简介-增强的并发工具

###JCTools
早在96年就有论文提出了无锁队列的概念，再到后来 Disruptor，高性能已得到生产的验证。此处介绍的 Jctools 中的高性能队列，其性能丝毫不输于 Disruptor。

JCTools (Java Concurrency Tools) 提供了一系列非阻塞并发数据结构（标准 Java 中缺失的），当存在线程争抢的时候，非阻塞并发数据结构比阻塞并发数据结构能提供更好的性能。

JCTools 是一个开源工具包，在 Apache License 2.0 下发布，并在 Netty、Rxjava 等诸多框架中被广泛使用。

JCTools 的开源 Github 仓库：https://github.com/JCTools/JCTools

在 Maven 中引入 JCtools jar 包就能使用 JCTools 了：

        <dependency>
            <groupId>org.jctools</groupId>
            <artifactId>jctools-core</artifactId>
            <version>3.0.0</version>
        </dependency>
JCTools 中主要提供了 Map 以及 Queue 的非阻塞并发数据结构：

####非阻塞 Map
    ConcurrentAutoTable（后面几个map/set结构的基础）
    NonBlockingHashMap
    NonBlockingHashMapLong
    NonBlockingHashSet
    NonBlockingIdentityHashMap
    NonBlockingSetInt
    NonBlockingHashMap 是对 ConcurrentHashMap 的增强，对多 CPU 的支持以及高并发更新提供更好的性能。

    NonBlockingHashMapLong 是 key 为 Long 型的 NonBlockingHashMap。

    NonBlockingHashSet 是对 NonBlockingHashMap 的简单包装以支持 set 的接口。

    NonBlockingIdentityHashMap 是从 NonBlockingHashMap 改造来的，使用 System.identityHashCode() 来计算哈希。

    NonBlockingSetInt 是一个使用 CAS 的简单的 bit-vector。

#### 非阻塞 Queue
JCTools 提供的非阻塞队列分为 4 类，可以根据不同的应用场景选择使用：

    SPSC-单一生产者单一消费者（有界和无界）
    MPSC-多生产者单一消费者（有界和无界）
    SPMC-单生产者多消费者（有界）
    MPMC-多生产者多消费者（有界）
    
    “生产者”和“消费者”是指“生产线程”和“消费线程”。

        // spsc-有界/无界队列
        Queue<String> spscArrayQueue = new SpscArrayQueue(16);
        Queue<String> spscUnboundedArrayQueue = new SpscUnboundedArrayQueue(2);
        // spmc-有界队列
        Queue<String> spmcArrayQueue = new SpmcArrayQueue<>(16);
        // mpsc-有界/无界队列
        Queue<String> mpscArrayQueue = new MpscArrayQueue<>(16);
        Queue<String> mpscChunkedArrayQueue = new MpscChunkedArrayQueue<>(1024, 8 * 1024);
        Queue<String> mpscUnboundedArrayQueue = new MpscUnboundedArrayQueue<>(2);
        // mpmc-有界队列
        Queue<String> mpmcArrayQueue = new MpmcArrayQueue<>(16);

JCTools是一款对jdk并发数据结构进行增强的并发工具，主要提供了map以及queue的增强数据结构。原来netty还是自己写的MpscLinkedQueueNode，后来新版本就换成使用JCTools的并发队列了。

增强map
    ConcurrentAutoTable(后面几个map/set结构的基础)
    NonBlockingHashMap
    NonBlockingHashMapLong
    NonBlockingHashSet
    NonBlockingIdentityHashMap
    NonBlockingSetInt
增强队列
    SPSC - Single Producer Single Consumer (Wait Free, bounded and unbounded)
    MPSC - Multi Producer Single Consumer (Lock less, bounded and unbounded)
    SPMC - Single Producer Multi Consumer (Lock less, bounded)
    MPMC - Multi Producer Multi Consumer (Lock less, bounded)

ConcurrentAutoTable
替代AtomicLong，专门为高性能的counter设计的。只有几个方法

public void add( long x );
public void decrement();
public void increment();
public void set( long x );
public long get();
public int  intValue();
public long longValue();
public long estimate_get();
对比AtomicLong主要是操作之后没有立即返回

public final long incrementAndGet();
public final long decrementAndGet()
NonBlockingHashMap
NonBlockingHashMap是对ConcurrentHashMap的增强，对多CPU的支持以及高并发更新提供更好的性能。
NonBlockingHashMapLong是key为Long型的NonBlockingHashMap。
NonBlockingHashSet是对NonBlockingHashMap的简单包装以支持set的接口。
NonBlockingIdentityHashMap是从NonBlockingHashMap改造来的，使用System.identityHashCode()来计算哈希
NonBlockingSetInt是一个使用CAS的简单的bit-vector

原来是

// --- hash ----------------------------------------------------------------
  // Helper function to spread lousy hashCodes.  Throws NPE for null Key, on
  // purpose - as the first place to conveniently toss the required NPE for a
  // null Key.
  private static final int hash(final Object key) {
    int h = key.hashCode();     // The real hashCode call
    h ^= (h>>>20) ^ (h>>>12);
    h ^= (h>>> 7) ^ (h>>> 4);
    h += h<<7; // smear low bits up high, for hashcodes that only differ by 1
    return h;
  }
改为

// --- hash ----------------------------------------------------------------
  // Helper function to spread lousy hashCodes
  private static final int hash(final Object key) {
    int h = System.identityHashCode(key); // The real hashCode call
    // I assume that System.identityHashCode is well implemented with a good
    // spreader, and a second bit-spreader is redundant.
    //h ^= (h>>>20) ^ (h>>>12);
    //h ^= (h>>> 7) ^ (h>>> 4);
    return h;
