package com.neo.bank;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.dispatch.OnComplete;
import akka.pattern.Patterns;
import scala.concurrent.Future;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // 创建一个 ActorSystem
        ActorSystem system = ActorSystem.create("MyActorSystem");

        // 使用 props 方法创建 MyActor 的实例
        final ActorRef myActor = system.actorOf(Props.create(BankActor.class), "bankActor");

        CountDownLatch addCount = new CountDownLatch(20);
        CountDownLatch minusCount = new CountDownLatch(10);

        Thread addCountT = new Thread(new Runnable() {
            @Override
            public void run() {
                while (addCount.getCount() > 0) {
                    myActor.tell(BankActor.Command.ADD, null);
                    addCount.countDown();
                }
            }
        });

        Thread minusCountT = new Thread(new Runnable() {
            @Override
            public void run() {
                while (minusCount.getCount() > 0) {
                    myActor.tell(BankActor.Command.MINUS, null);
                    minusCount.countDown();
                }
            }
        });

        minusCountT.start();
        addCountT.start();
        minusCount.await();
        addCount.await();


        Future<Object> count = Patterns.ask(myActor, BankActor.Command.GET, 60_000);

        //count.onSuccess();
        System.out.println(count);
        count.onComplete(new OnComplete<Object>() {
            @Override
            public void onComplete(Throwable failure, Object success) throws Throwable {
                if (failure != null) {
                    //System.out.println("====================================" + failure.getMessage());
                } else {
                    System.out.println("====================================" + success);
                }
            }
        },system.dispatcher());



    }
}
