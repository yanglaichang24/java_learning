package com.yang.api.java;

public class DemoClazz extends FatherClazz implements DemoInf{

    private int num;
    private String version;

    DemoClazz(){
        System.out.println("DemoClazz Construction");
    }

    @Override
    public void m_1() {
        System.out.println(" m-1");
    }

    @Override
    public void m_1(int p_1) {
        System.out.println(" m-1");
    }

    public String version(){
        return version;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
