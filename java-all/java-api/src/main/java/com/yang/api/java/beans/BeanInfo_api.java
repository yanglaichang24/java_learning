package com.yang.api.java.beans;

import com.yang.api.java.DemoClazz;
import org.junit.Test;

import java.beans.*;
import java.util.Arrays;

public class BeanInfo_api {

    /*
    *  java.beans.BeanInfo 是 JavaBeans API 中的一个重要接口，
    *  它允许开发者获取关于 JavaBean 的方法、属性、事件和其他特性的显式信息。
    *  通过 BeanInfo 接口，可以创建 BeanInfo 类，这个类包含了特定 JavaBean 的元数据信息
    * */

    @Test
    public void beanInfo() throws IntrospectionException {
        //TODO
        BeanInfo beanInfo = Introspector.getBeanInfo(DemoClazz.class);
        System.out.println(beanInfo.getClass());

        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();

        Arrays.stream(methodDescriptors).forEach(System.out::println);

        BeanDescriptor beanDescriptor = beanInfo.getBeanDescriptor();
        System.out.println(beanDescriptor);

        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        Arrays.stream(propertyDescriptors).forEach(System.out::println);

    }


}
