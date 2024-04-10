package com.ylch.test.jdk_class_test.queue;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueTest {


    @Test
    public void test() {
        DelayQueue<DelayBean> objects = new DelayQueue<DelayBean>();

        objects.add(new DelayBean(1_000));
        objects.add(new DelayBean(2_000));
        objects.add(new DelayBean(3_000));
        objects.add(new DelayBean(4_000));

        DelayBean poll = objects.poll();

    }

    class DelayBean implements Delayed {

        int d;

        DelayBean(int d) {
            this.d = d;
        }

        public int getD() {
            return d;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.toNanos(d);
        }

        @Override
        public int compareTo(Delayed o) {
            return this.d > getD() ? 1 : -1;
        }
    }


}
