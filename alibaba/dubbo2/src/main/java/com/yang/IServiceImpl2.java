package com.yang;

public class IServiceImpl2 implements Iservice2 {

    @Override
    public String execute(String str) {
        return "IServiceImpl2 "+str;
    }

    @Override
    public void doit(String str) {

    }
}
