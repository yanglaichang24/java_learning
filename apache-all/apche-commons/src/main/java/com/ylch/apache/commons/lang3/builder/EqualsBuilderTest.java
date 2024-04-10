package com.ylch.apache.commons.lang3.builder;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Test;

/**
 * @author Mr.Yang
 * @desc EqualsBuilderTest
 * @date 2023/1/5 18:23
 */
public class EqualsBuilderTest {

    /**
     *  Assists in implementing Object.equals(Object) methods.
     *
     *  此类提供了为任何类构建良好的equals方法的方法。
     *  它遵循乔舒亚·布洛赫（Joshua Bloch）在《有效Java》中提出的规则。
     *  特别是比较双精度、浮点和数组的规则可能很棘手。此外，确保equals（）和hashCode（）一致可能很困难。
     *
     *  两个比较为相等的对象必须生成相同的哈希代码，但具有相同哈希代码的两个对象不必相等。
     *
     *  所有相关字段都应包含在相等值的计算中。可以忽略派生字段。特别是，用于生成哈希代码的任何字段都必须在equals方法中使用，反之亦然
     *
     *
     *  public boolean equals(Object obj) {
     *      if (obj == null) { return false; }
     *      if (obj == this) { return true; }
     *      if (obj.getClass() != getClass()) {
     *        return false;
     *      }
     *      MyClass rhs = (MyClass) obj;
     *      return new EqualsBuilder()
     *                    .appendSuper(super.equals(obj))
     *                    .append(field1, rhs.field1)
     *                    .append(field2, rhs.field2)
     *                    .append(field3, rhs.field3)
     *                    .isEquals();
     *     }
     *
     *  或者，有一种方法使用反射来确定要测试的场。因为这些字段通常是私有的，
     *  所以reflectionEquals方法使用AccessibleObject.setAccessible来更改字段的可见性。
     *  在安全管理器下，这将失败，除非正确设置了相应的权限。它也比显式测试慢。非基元字段使用equals（）进行比较。
     *
     *
     *
     */




    @Test
    public void equalsBuilderTest(){

        DemoBean demoBean = new DemoBean();
        //demoBean.f1 = "";

        DemoBean demoBean2 = new DemoBean();

        System.out.println(new EqualsBuilder()
                          //.appendSuper(super.equals(obj))
                            .append(demoBean.f1, demoBean2.f1)
                            .append(demoBean.f2, demoBean2.f2)
                                .isEquals());


    }

    static class DemoBean {

        private String f1;
        private Integer f2;
        private int f3;
        private Long f4;
        private long f5;
        private DemoBean innerBean;







    }









}
