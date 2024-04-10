package com.ylch.apache.commons.lang3.tuple;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.MutablePair;
import org.junit.Test;

/**
 * @author Mr.Yang
 * @desc PairTest
 * @date 2023/1/4 19:57
 */
public class PairTest {


    @Test
    public void immutablePairtest(){
        ImmutablePair<String, String> immutablePair = ImmutablePair.of("11", "eee");
        System.out.println(immutablePair.getLeft());
        System.out.println(immutablePair.getRight());

        System.out.println(immutablePair.getKey());
        System.out.println(immutablePair.getValue());
    }

    @Test
    public void mutablePairTest(){

        MutablePair<String, String> mutablePair = MutablePair.of("11", "eee");
        System.out.println(mutablePair.getLeft());
        System.out.println(mutablePair.getRight());

        mutablePair.setLeft("left");
        mutablePair.setRight("setRight");

        System.out.println(mutablePair.getKey());
        System.out.println(mutablePair.getValue());
    }




}
