package com.yang.api.java;

public interface DemoInf {

    default void def_m(){
        System.out.println(" this is inf def_method");
    }

    void m_1();

    void m_1(int p_1);

}
