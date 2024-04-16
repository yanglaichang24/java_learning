package com.yang.api.java.java.io;

import org.junit.Test;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author Mr.Yang
 * @desc Closeable_Test
 * @date 2023/3/31 16:10
 */
public class Closeable_Test implements Closeable {

    public void test(){
        System.out.println("test");
    }

    @Override
    public void close() throws IOException {
        System.out.println("-----I closed-----");
    }

    @Test
    public void test1(){
        Closeable_Test closeable_test = new Closeable_Test();
        closeable_test.test();
    }

    @Test
    public void test2(){
        //try( XXXXXXXXX  ){

        //}catch(Exception e){
        //
        //}

        try (Closeable_Test closeable_test = new Closeable_Test()) {
            closeable_test.test();
        }catch (Exception e){
            e.printStackTrace();
        }

    }






}
