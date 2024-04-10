package com.ylch.test.jdk_class_test.compare;

import org.apache.tools.ant.types.resources.selectors.Compare;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Mr.Yang
 * @desc Compare_test
 * @date 2023/5/15 16:35
 */
public class Compare_test {


    @Test
    public void test(){
        //
        ArrayList<CompareBean> objects = new ArrayList<>();
        objects.add(new CompareBean(10));
        objects.add(new CompareBean(43));
        objects.add(new CompareBean(100));
        Collections.sort(objects);
        System.out.println(objects);


        //
        Collections.sort(objects, (o1, o2) -> 0);
    }



    @Test
    public void test2(){
        List<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(100);
        objects.add(200);
        objects.add(3);

        Collections.sort(objects);

//        Collections.sort(objects, (o1, o2) ->
//                o1.intValue());

        System.out.println(objects);
    }



}
