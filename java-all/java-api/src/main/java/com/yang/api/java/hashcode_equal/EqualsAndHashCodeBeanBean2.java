package com.yang.api.java.hashcode_equal;

import java.util.Objects;

/**
 * @author Mr.Yang
 * @desc DemoBean2
 * @date 2023/3/20 18:35
 */
public class EqualsAndHashCodeBeanBean2 extends EqualsAndHashCodeBean {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHashCodeBean equalsAndHashCodeBean = (EqualsAndHashCodeBean) o;
        return id == equalsAndHashCodeBean.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
