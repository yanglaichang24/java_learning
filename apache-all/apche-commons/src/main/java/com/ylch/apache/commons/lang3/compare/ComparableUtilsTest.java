package com.ylch.apache.commons.lang3.compare;

import org.apache.commons.lang3.compare.ComparableUtils;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Mr.Yang
 * @desc ComparableUtilsTest
 * @date 2023/2/9 20:03
 */
public class ComparableUtilsTest {


    @Test
    public void test(){
        print(ComparableUtils.is(4).between(3, 5));

        print(ComparableUtils.is(4).between(2, 3));

        print(ComparableUtils.is(4).greaterThan(5));

        print(ComparableUtils.is(4).lessThan(5));
    }

    public static void print(Object... objects){
        System.out.println(Arrays.toString(objects));
    }



}
