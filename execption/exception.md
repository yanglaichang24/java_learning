

###
     org.redisson.RedissonShutdownException: Redisson is shutdown
        at org.redisson.command.RedisExecutor.execute(RedisExecutor.java:110) ~[redisson-3.11.6.jar:3.11.6]
        at org.redisson.command.CommandAsyncService.async(CommandAsyncService.java:609) ~[redisson-3.11.6.jar:3.11.6]
        at org.redisson.command.CommandAsyncService.writeAsync(CommandAsyncService.java:594) ~[redisson-3.11.6.jar:3.11.6]
        at org.redisson.RedissonAtomicDouble.addAndGetAsync(RedissonAtomicDouble.java:52) ~[redisson-3.11.6.jar:3.11.6]
        at org.redisson.RedissonAtomicDouble.addAndGet(RedissonAtomicDouble.java:44) ~[redisson-3.11.6.jar:3.11.6]
        at lm.td.consume.service.BillingSearchService.addScheduleCash(BillingSearchService.java:85) ~[classes!/:1.0]
        at lm.td.consume.runner.LegoBillingConsumer.lego(LegoBillingConsumer.java:151) ~[classes!/:1.0]
        at lm.td.consume.runner.LegoBillingConsumer$1.lambda$doPull$135(LegoBillingConsumer.java:100) ~[classes!/:1.0]
        at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184) [?:1.8.0_231]
        at java.util.LinkedList$LLSpliterator.forEachRemaining(LinkedList.java:1235) [?:1.8.0_231]
        at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482) [?:1.8.0_231]
        at java.util.stream.ForEachOps$ForEachTask.compute(ForEachOps.java:291) [?:1.8.0_231]
        at java.util.concurrent.CountedCompleter.exec(CountedCompleter.java:731) [?:1.8.0_231]