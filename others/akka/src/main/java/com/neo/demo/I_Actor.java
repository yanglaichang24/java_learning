package com.neo.demo;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import scala.PartialFunction;
import scala.runtime.BoxedUnit;

public class I_Actor extends AbstractActor {

    // 用于日志记录的 LoggingAdapter
    private final LoggingAdapter log = Logging.getLogger(context().system(), this);

    public I_Actor(){
        receive(
                ReceiveBuilder
                        .match(Double.class, d -> {
                            log.info("d= {}",d);
                            sender().tell(d.isNaN() ? 0 : d, self());
                        })
                        .match(Integer.class, i -> {
                            log.info("Integer= {}",i);
                            sender().tell(i * 10, self());
                         })
                        .match(String.class, s -> s.startsWith("Hello"), this::onReceiveString)
                        .build());
    }



    @Override
    public void preStart() throws Exception {
        super.preStart();
        log.info("========== preStart ====");
    }

    @Override
    public void postStop() throws Exception {
        super.postStop();
        log.info("========== postStop ====");
    }

    @Override
    public void aroundReceive(PartialFunction<Object, BoxedUnit> receive, Object msg) {
        log.info("========== aroundReceive-1  ====");
        super.aroundReceive(receive, msg);
        log.info("========== aroundReceive-2 ====");
    }

    @Override
    public void aroundPreStart() {
        log.info("========== aroundPreStart-1  ====");
        super.aroundPreStart();
        log.info("========== aroundPreStart-2  ====");
    }


    // 处理接收到的 String 消息
    private void onReceiveString(String message) {
        log.info("=============Received String message: {}", message);
        // 这里可以发送消息给其他 actors 或者做其他事情
        // 例如，我们可以将消息发送回 sender
        sender().tell(" ========= Message received! =============", self());
    }

    // 工厂方法，用于创建 MyActor 的实例
    public static Props props() {
        return Props.create(com.neo.scala.demo.I_Actor.class);
    }

}
