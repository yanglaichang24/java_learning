package com.ylch.test.jdk_class_test.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mr.Yang
 * @desc ContainsKeyTest
 * @date 2023/3/21 19:58
 */
public class ContainsKeyTest {

    // 这里我们是Long和Integer比较。equals比较不通过

    @Test
    public void test(){
        Map<Integer, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(4444,"");
        System.out.println(objectObjectHashMap.containsKey(4444L));
    }


}
