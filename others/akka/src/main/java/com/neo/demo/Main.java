package com.neo.demo;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

public class Main {

    public static void main(String[] args) {
        // 创建一个 ActorSystem
        ActorSystem system = ActorSystem.create("MyActorSystem");

        // 使用 props 方法创建 MyActor 的实例
        final ActorRef myActor = system.actorOf(I_Actor.props(), "myActor");

        // 发送消息给 MyActor
        new Thread(
                () -> myActor.tell("Hello from Main!", ActorRef.noSender())
        ).start();

        // 发送消息给 MyActor
        new Thread(
                () -> myActor.tell(1, ActorRef.noSender())
        ).start();

        // 发送消息给 MyActor
        new Thread(
                () -> myActor.tell(1.0D, ActorRef.noSender())
        ).start();


        // 发送消息给 MyActor
        new Thread(
                () -> myActor.tell(1.0F, ActorRef.noSender())
        ).start();



       // Patterns.ask(ActorRef,)


        // 在某些情况下，你可能需要等待 ActorSystem 终止。
        // 在这个简单的例子中，我们直接退出主程序。
        // 通常，在一个更复杂的应用中，你可能需要等待所有的任务完成，然后关闭 ActorSystem。

        //system.terminate();
    }
}
