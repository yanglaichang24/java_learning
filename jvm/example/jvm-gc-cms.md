
-XX:+UseConcMarkSweepGC -XX:+UseParNewGC

> 激活cms,默认使用parNewGC+cms+Serial Old
> Serial Old 作为cms出现Concurrent Mode Failure 失败以后的后备收集器使用


-XX:CMSInitiatingOccupancyFraction=n -XX:+UseCMSInitiatingOccupancyOnly
> 在老年代的空间被占用n%时，调用cms 算法对老年代进行垃圾回收
> UseCMSInitiatingOccupancyOnly 一起使用
> 

-XX:+UseCMSCompactAtFullCollection -XX:CMSFullGCsBeforeCompaction=0
>full gc 做压缩，
> CMSFullGCsBeforeCompaction 设置多少次full gc 对内存进行压缩

-XX:+CMSParallelInitialMarkEnabled


-XX:+CMSScavengeBeforeRemark
>cms 前启动一次ygc,减少old gen 对 yong gen的引用，降低remark的开销

-XX:ParallelGCThreads=10 -XX:ParallelCMSThreads=10
>设置cms算法中并行线程的数量
> 
