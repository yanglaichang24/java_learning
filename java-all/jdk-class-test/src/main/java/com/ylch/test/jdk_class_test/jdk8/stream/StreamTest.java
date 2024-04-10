package com.ylch.test.jdk_class_test.jdk8.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {




    public static void main(String[] args) {

        //Stream.of("a").filter()

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("3");
        objects.add("3");
        objects.add("4");

//        List<String> collect = objects.stream()
//                .filter(Objects::nonNull)
//                .map(Object::toString)
//                .collect(Collectors.toList());

        objects.stream()
                .filter(Objects::nonNull)
                .map(Object::toString)
                .distinct()
                .collect(Collectors.toList());



        new ArrayList<>().parallelStream();

    }



    @Test
    public void test03(){

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("3,4,5");
        objects.add("3");
        objects.add("4");


        objects.stream()
                .filter(Objects::nonNull)
                .map(Object::toString)
                .flatMap(t->Stream.of(t.split(",")))
                .distinct()
                .collect(Collectors.toList());
    }



}
