package com.ylch.test.jdk_class_test.jdk8.completableFuture;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Mr.Yang
 * @desc CompletableFutureTest
 * @date 2022/12/30 11:29
 */
public class CompletableFutureTest {


    public String threadName(){
        return Thread.currentThread().getName();
    }

    // 异步操作
    /**
     *
     *
     *
     *
     */
    @Test
    public void runAsync() throws InterruptedException {
        CompletableFuture
                .runAsync(() -> System.out.println(threadName()+"= exe"))
                .whenComplete((v, e)-> System.out.println(threadName()+"=done")
        );
        Thread.sleep(2000);
    }

    @Test
    public void runAsync2() throws InterruptedException {
        CompletableFuture.runAsync(() -> System.out.println(threadName()+"= exe"),
                Executors.newSingleThreadExecutor());

        Thread.sleep(2000);
    }

    @Test
    public void supplyAsync() throws InterruptedException {
        CompletableFuture
                .supplyAsync(()->{ System.out.println(threadName()+" = exe");return "result"; })
                .whenComplete((v,e)->{ System.out.println(threadName()+"= done ="+v);
        });
        Thread.sleep(2000);
    }


}
