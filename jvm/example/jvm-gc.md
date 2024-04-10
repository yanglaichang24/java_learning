### 开启GC功能

>使用-verbose:gc或-XX:+PrintGC这两个标志中的任意一个能创建基本的GC日志
（这两个日志标志实际上互为别名，默认情况下的GC日志功能是关闭的）

### GC日志输出的路径
    -Xloggc:/XXX/gc.log 

### 打印GC详细信息
    -XX:+PrintGCDetails

### 开启GC时间提示 输出GC的日期戳
     -XX:+PrintGCTimeStamps或者-XX:+PrintGCDateStamps

### 开启滚动日志
> 打开GC日志滚动记录功能 
>> -XX:+UseGCLogFileRotation
>
> 设置滚动日志文件的个数，必须大于等于1
>> -XX:NumberOfGCLogFiles=10
> 
> 设置滚动日志文件的大小，必须大于8k
>> -XX:GCLogFileSize=512M

### 打印应用程序执行使时间
>-XX:+PrintGCApplicationConcurrentTime

### 打印GC造成应用暂停的时间
    -XX:+PrintGCApplicationStoppedTime

### 在进行GC的前后打印出堆的信息
    -XX:+PrintHeapAtGC

### 在每次新生代 young GC时,输出幸存区中对象的年龄分布
> -XX:+PrintTenuringDistribution

### 跟踪软引用、弱引用、虚引用和Finallize队列。
> -XX:+PrintReferenceGC

###打印GC原因
>-XX:+PrintGCCause 




### Demo

>-XX:+PrintGCDetails
-XX:+PrintGCDateStamps
-Xloggc:D://haha//gc.log
-XX:+UseGCLogFileRotation
-XX:NumberOfGCLogFiles=10
-XX:GCLogFileSize=512k
-XX:+PrintGCApplicationStoppedTime
-XX:+PrintHeapAtGC
-XX:+HeapDumpOnOutOfMemoryError
-XX:HeapDumpPath=D://haha




>