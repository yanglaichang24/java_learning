/*
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.dispatch.OnComplete;
import akka.pattern.Patterns;
import scala.concurrent.Future;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

*/
/**
 * @author Mr.Yang
 * @desc HelloWord
 * @date 2022/10/18 10:24
 *//*

public class HelloWord {

    public static void main(String[] args) throws InterruptedException {

        final ActorSystem actorSystem = ActorSystem.create("actor-system");

        final ActorRef actorRef = actorSystem.actorOf(Props.create(BankActor.class), "bank-actor");

        CountDownLatch addCount = new CountDownLatch(20);
        CountDownLatch minusCount = new CountDownLatch(10);

        Thread addCountT = new Thread(new Runnable() {
            @Override
            public void run() {
                while (addCount.getCount() > 0) {
                    actorRef.tell(BankActor.Command.ADD, null);
                    addCount.countDown();
                }
            }
        });

        Thread minusCountT = new Thread(new Runnable() {
            @Override
            public void run() {
                while (minusCount.getCount() > 0) {
                    actorRef.tell(BankActor.Command.MINUS, null);
                    minusCount.countDown();
                }
            }
        });

        minusCountT.start();
        addCountT.start();
        minusCount.await();
        addCount.await();

        Future<Object> count = Patterns.ask(actorRef, BankActor.Command.GET, 1000);
       */
/* count.onComplete(
                new OnComplete<Object>() {
                    @Override
                    public void onComplete(Throwable failure, Object success) throws Throwable {
                        if (failure != null) {
                            failure.printStackTrace();
                        } else {
                            //log.info("Get result from " + success);
                        }
                    }
                },null);*//*

               */
/* Executors.directExecutionContext());*//*

        actorSystem.shutdown();


    }


}
*/
