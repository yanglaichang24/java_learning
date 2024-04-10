package com.ylch.test.jdk_class_test.queue;

import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {



    @Test
    public void test(){
        PriorityQueue<Integer> objects = new PriorityQueue<Integer>();
        objects.add(1);
        objects.add(100);
        objects.add(101);
        objects.add(12);
        Integer poll = objects.poll();
        System.out.println(poll);
    }




}
