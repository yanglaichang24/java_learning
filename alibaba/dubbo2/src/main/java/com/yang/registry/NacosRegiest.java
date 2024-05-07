package com.yang.registry;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.Registry;
import org.apache.dubbo.registry.nacos.NacosRegistryFactory;

public class NacosRegiest {

    public static void main(String[] args) {
       //nacos://192.168.2.6:8848/org.apache.dubbo.registry.RegistryService?application=first-dubbo-provider&dubbo=2.0.2&export=dubbo%3A%2F%2F192.168.1.6%3A20880%2Fcom.yang.IService%3Fanyhost%3Dtrue%26application%3Dfirst-dubbo-provider%26bind.ip%3D192.168.1.6%26bind.port%3D20880%26deprecated%3Dfalse%26dubbo%3D2.0.2%26dynamic%3Dtrue%26generic%3Dfalse%26interface%3Dcom.yang.IService%26metadata-type%3Dremote%26methods%3Ddoit%2Cexecute%26pid%3D5400%26release%3D2.7.23%26service.name%3DServiceBean%3A%2Fcom.yang.IService%26side%3Dprovider%26timestamp%3D1714201064201&pid=5400&release=2.7.23&timestamp=1714201064190
        URL url = new URL("dubbo","192.168.2.6",8848);
        Registry registry = new NacosRegistryFactory().getRegistry(url);
        //registry.register(new URL("dubbo",));

    }

}
