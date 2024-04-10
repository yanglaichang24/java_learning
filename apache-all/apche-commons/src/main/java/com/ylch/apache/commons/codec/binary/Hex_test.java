package com.ylch.apache.commons.codec.binary;

import org.apache.commons.codec.binary.Hex;
import org.junit.Test;

/**
 * @author Mr.Yang
 * @desc Hex_test
 * @date 2023/5/12 16:34
 */
public class Hex_test {


    @Test
    public void test(){
        byte[] bytes = {2,3,126,-34};
        System.out.println(Hex.encodeHexString(bytes));
    }



}
