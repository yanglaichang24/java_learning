package com.ylch.test.jdk_class_test.hashcode_equal;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by yanglaichang1 on 2017/3/8.
 */
public class TestDto implements Serializable {

    private long id;

    private String name;

    private String phone;

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
        TestDto testDto = (TestDto) o;
        return id == testDto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }




    public static void main(String[] args) {
        TestDto testDto = new TestDto();
        testDto.setId(1);

        TestDto testDto2 = new TestDto();
        testDto2.setId(1);

        System.out.println(testDto2.equals(testDto));

    }



}
