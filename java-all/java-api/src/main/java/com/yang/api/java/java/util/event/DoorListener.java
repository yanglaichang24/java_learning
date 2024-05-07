package com.yang.api.java.java.util.event;

import java.util.EventListener;

/**
 * Created by yanglaichang1 on 2017/3/1.
 */
public interface DoorListener<T> extends EventListener {

    void doorEvent(T event);

}
