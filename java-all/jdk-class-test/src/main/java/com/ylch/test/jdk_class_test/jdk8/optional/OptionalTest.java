package com.ylch.test.jdk_class_test.jdk8.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @author Mr.Yang
 * @desc OptionalTest
 * @date 2023/2/9 18:01
 */
public class OptionalTest {


    @Test
    public void test1(){
        Object o = new Object();
        Object o1 = Optional.of(o).orElse(null);

        System.out.println(o1);

        System.out.println(Optional.of(o).get());

        System.out.println(Optional.of(o).orElseGet(()->"33"));

        System.out.println(Optional.of(o).orElseThrow(()->new RuntimeException("")));

        Object o2 = Optional.of(null).orElse(o);
        System.out.println(o2);
    }

    @Test
    public void test2(){
        Object o = new Object();

        System.out.println(Optional.ofNullable(o).get());
        System.out.println(Optional.ofNullable(null).filter(t->null != t).orElseGet(()->"other"));

    }





}
