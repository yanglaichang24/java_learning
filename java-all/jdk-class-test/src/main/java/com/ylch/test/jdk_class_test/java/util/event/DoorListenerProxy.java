package com.ylch.test.jdk_class_test.java.util.event;

import java.util.EventListener;
import java.util.EventListenerProxy;

/**
 * @author Mr.Yang
 * @desc DoorListenerProxy
 * @date 2023/3/31 15:57
 */
public class DoorListenerProxy extends EventListenerProxy implements DoorListener {

    /**
     * Creates a proxy for the specified listener.
     *
     * @param listener the listener object
     */
    public DoorListenerProxy(EventListener listener) {
        super(listener);
    }

    @Override
    public void doorEvent(Object event) {

    }
}
