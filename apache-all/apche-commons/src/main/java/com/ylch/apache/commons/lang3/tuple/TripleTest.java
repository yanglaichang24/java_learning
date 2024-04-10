package com.ylch.apache.commons.lang3.tuple;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.MutableTriple;
import org.junit.Test;

/**
 * @author Mr.Yang
 * @desc TripleTest
 * @date 2023/1/4 20:22
 */
public class TripleTest {


    @Test
    public void immutableTriple(){
        ImmutableTriple<String, Integer, String> triple = ImmutableTriple.of("11", 1, "eee");
        System.out.println(triple.getLeft());
        System.out.println(triple.getMiddle());
        System.out.println(triple.getRight());

    }

    @Test
    public void mutableTriple(){
        MutableTriple<String, Long, String> triple = MutableTriple.of("11", 1L, "eee");
        System.out.println(triple.getLeft());
        System.out.println(triple.getMiddle());
        System.out.println(triple.getRight());

        System.out.println("--- \n ----");

        triple.setLeft("left");
        triple.setMiddle(3L);
        triple.setRight("setRight");

        System.out.println(triple.getLeft());
        System.out.println(triple.getMiddle());
        System.out.println(triple.getRight());



    }


}
