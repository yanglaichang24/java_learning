package com.neo;

public class Demo {

    public void say(){
        System.out.println("say ----------");
    }

    public String say1(){
        return "xxxxx";
    }


    public static void main(String[] args) {
        // 实例化scala 对象
        Hello pt = new Hello(10, 20);
        pt.move(10, 10);
    }


}
