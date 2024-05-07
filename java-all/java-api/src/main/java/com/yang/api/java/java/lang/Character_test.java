package com.yang.api.java.java.lang;

import org.junit.Test;

/**
 * @author Mr.Yang
 * @desc Character_test
 * @date 2023/5/18 14:23
 */
public class Character_test {

    @Test
    public void test1() {
        char ch = ',';
        System.out.println(Character.isLetter(ch));

        ch = 'a';
        System.out.println(Character.isLetter(ch));

    }



}
