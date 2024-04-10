package com.ylch.test.jdk_class_test.java.clazz;

/**
 * @author Mr.Yang
 * @desc OutClazz
 * @date 2023/4/3 16:31
 */
public class OutClazz {

    int m = 10000;

    class Inner{

        int i = 1;

        public void test(){
            System.out.println("内部类调用内部类 = "+ i);
        }

        public void test2(){
            System.out.println("内部类调用外部类 "+ m);
        }
    }

    public void test3(){
        Inner inner = new Inner();
        inner.test();
        inner.test2();
    }

    public static void main(String[] args) {
        OutClazz outClazz = new OutClazz();
        Inner inner = outClazz.new Inner();

        inner.test2();
        outClazz.test3();
    }






}
