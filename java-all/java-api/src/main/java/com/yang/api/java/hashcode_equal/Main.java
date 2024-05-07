package com.yang.api.java.hashcode_equal;

import org.junit.Test;

/**
 * @author Mr.Yang
 * @desc Main
 * @date 2023/3/20 18:39
 */
public class Main {


    @Test
    public void demo(){
        EqualsAndHashCodeBean equalsAndHashCodeBean = new EqualsAndHashCodeBean();
        EqualsAndHashCodeBean equalsAndHashCodeBean2 = new EqualsAndHashCodeBean();
        System.out.println(equalsAndHashCodeBean.equals(equalsAndHashCodeBean2));
    }

    @Test
    public void demo2(){
        EqualsAndHashCodeBean equalsAndHashCodeBean = new EqualsAndHashCodeBean();
        equalsAndHashCodeBean.setId(1);

        EqualsAndHashCodeBean equalsAndHashCodeBean2 = new EqualsAndHashCodeBean();
        equalsAndHashCodeBean2.setId(2);

        System.out.println(equalsAndHashCodeBean.equals(equalsAndHashCodeBean2));
    }


    @Test
    public void demo3(){
        EqualsAndHashCodeBean equalsAndHashCodeBean = new EqualsAndHashCodeBean();
        equalsAndHashCodeBean.setId(1);

        EqualsAndHashCodeBean equalsAndHashCodeBean2 = new EqualsAndHashCodeBean();
        equalsAndHashCodeBean2.setId(1);

        System.out.println(equalsAndHashCodeBean.equals(equalsAndHashCodeBean2));
    }


    @Test
    public void demo4(){
        EqualsAndHashCodeBean equalsAndHashCodeBean = new EqualsAndHashCodeBean();
        equalsAndHashCodeBean.setId(1);
        equalsAndHashCodeBean.setName("name1");

        EqualsAndHashCodeBean equalsAndHashCodeBean2 = new EqualsAndHashCodeBean();
        equalsAndHashCodeBean2.setId(2);
        equalsAndHashCodeBean2.setName("name2");
        System.out.println(equalsAndHashCodeBean.equals(equalsAndHashCodeBean2));
    }





}
