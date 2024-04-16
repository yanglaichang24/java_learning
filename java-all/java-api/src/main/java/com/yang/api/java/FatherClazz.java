package com.yang.api.java;

public class FatherClazz {

    private int id;
    private String name;


    FatherClazz(){
        System.out.println("FatherClazz Construction");
    }

    public String m_mix(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
