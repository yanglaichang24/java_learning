## 默认线程研究

### DestroyJavaVM

### Reference Handler

### Signal Dispatcher

### Finalizer

### C2 CompilerThread0

### C2 CompilerThread1

### C1 CompilerThread2

### Attach Listener

这个 Attach Listener, 在一些常用的工具里面 经常会和它有关, 比如 jstack, jinfo, jmap, jconsole 等等, 都可能会和  Attach Listener 进行交互的 


> Attach Listener 和 Signal Dispatcher 的一些对比
1. 数据的交互方式

前者通过 Socket 进行通信, 后者通过 信号机制 进行通信

前者可以传递 一个标记, 一定的参数, 后者只有一个 标记

2. 业务的执行

前者在 vm 内部执行, 后者在 java 层面上执行

3. 业务的限定

前者只有固定的 N 中业务可以处理, 后者是可以 自定义业务处理

