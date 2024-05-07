package com.yang.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.*;

public class spi {

    public static void main(String[] args) {
       // Protocol adaptiveExtension = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
       // System.out.println(adaptiveExtension);


        ProxyFactory adaptiveExtension = ExtensionLoader.getExtensionLoader(ProxyFactory.class).getAdaptiveExtension();

        System.out.println(adaptiveExtension);
    }

}
