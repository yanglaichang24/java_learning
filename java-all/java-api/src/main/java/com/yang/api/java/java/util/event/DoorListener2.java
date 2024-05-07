package com.yang.api.java.java.util.event;

/**
 * Created by yanglaichang1 on 2017/3/1.
 */
public class DoorListener2 implements DoorListener<DoorEvent> {

    @Override
    public void doorEvent(DoorEvent event) {
        if (event.getDoorState() != null && event.getDoorState().equals("open")) {
            System.out.println("门2 打开");
        } else {
            System.out.println("门2 关闭");
        }
    }

}
