package com.yang;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

public class Provider {

    public static void main(String[] args) throws InterruptedException {
        ServiceConfig<IService> service = new ServiceConfig<IService>();
        service.setApplication(new ApplicationConfig("first-dubbo-provider"));
        service.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
        service.setInterface(IService.class);
        service.setProtocol(new ProtocolConfig("dubbo"));
        service.setRef(new IServiceImpl());
        service.export();


        ServiceConfig<Iservice2> service2 = new ServiceConfig<Iservice2>();
        service2.setApplication(new ApplicationConfig("first-dubbo-provider"));
        service2.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
        service2.setInterface(Iservice2.class);
        service2.setProtocol(new ProtocolConfig("dubbo"));
        service2.setRef(new IServiceImpl2());
        service2.export();


        Thread.sleep(10000L);
    }


}
