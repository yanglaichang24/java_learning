package com.yang.api.java.hashcode_equal;

import java.util.Objects;

/**
 * @author Mr.Yang
 * @desc Demo
 * @date 2023/3/20 18:35
 */
public class EqualsAndHashCodeBean {

    protected long id;
    protected String name;
    protected String phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHashCodeBean that = (EqualsAndHashCodeBean) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone);
    }
}
