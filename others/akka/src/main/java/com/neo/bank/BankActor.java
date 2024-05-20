package com.neo.bank;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;

public class BankActor extends AbstractActor {

    private final LoggingAdapter log = Logging.getLogger(context().system(), this);

    private int count;

    public BankActor() {
        receive(ReceiveBuilder
                .matchEquals(Command.ADD, i -> {
                    log.info("Add 1 from {} to {}", count, ++count);
                })
                .matchEquals(Command.MINUS, i -> {
                    log.info("Minus 1 from {} to {}", count, --count);
                })
                .matchEquals(Command.GET, i -> {
                    log.info("Return current count " + sender());
                    sender().tell(count, self());
                }).build());
    }

    @Override
    public void preStart() throws Exception {
        super.preStart();
        System.out.println("preStart");
        count = 0;
    }

    enum Command {
        ADD,
        MINUS,
        GET
    }
}
