package com.ylch.test.jdk_class_test.java.util.event;

/**
 * Created by yanglaichang1 on 2017/3/1.
 */
public class DoorListener1 implements DoorListener<DoorEvent> {


    public void doorEvent(DoorEvent event) {
        if(event.getDoorState()!=null&&event.getDoorState().equals("open")) {
            System.out.println("门1 打开");
        } else {
            System.out.println("门1 关闭");
        }
    }
}
