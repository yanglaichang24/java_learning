package com.yang.provider;

import com.yang.IService;
import com.yang.IServiceImpl;
import com.yang.IServiceImpl2;
import com.yang.Iservice2;
import org.apache.dubbo.config.*;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

public class Provider {

    public static void main(String[] args) throws InterruptedException {
        ServiceConfig<IService> service = new ServiceConfig<IService>();
        service.setApplication(new ApplicationConfig("first-dubbo-provider"));
        //service.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
        service.setRegistry(new RegistryConfig("nacos://192.168.2.6:8848"));
        service.setInterface(IService.class);
        service.setProtocol(new ProtocolConfig("dubbo"));
        service.setRef(new IServiceImpl());
        service.export();

       // 定义所有的服务
       /* ServiceConfig<Iservice2> service2 = new ServiceConfig<Iservice2>();
        service2.setInterface(Iservice2.class);
        service2.setRef(new IServiceImpl2());

        // 启动 Dubbo
        DubboBootstrap.getInstance()
                .application("first-dubbo-provider")
                //.registry(new RegistryConfig("multicast://224.5.6.7:1234"))
                .registry(new RegistryConfig("nacos://t2:8848"))
                .protocol(new ProtocolConfig("dubbo"))
                .service(service2)
                .start();*/








        Thread.sleep(10 * 60_000L);
    }


}
