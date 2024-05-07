package com.yang.consumer;

import com.yang.IService;
import com.yang.Iservice2;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

public class Consumer {


    public static void main(String[] args) {
        ReferenceConfig<IService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("first-dubbo-consumer"));
        //reference.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));

        reference.setRegistry(new RegistryConfig("nacos://192.168.2.6:8848?backup=192.168.2.5:8848"));

        reference.setInterface(IService.class);
        IService service = reference.get();
        String message = service.execute("dubbo");
        System.out.println("--------------------" + message);



        // 定义所有的订阅
      /*  ReferenceConfig<Iservice2> reference2 = new ReferenceConfig<>();
        reference2.setInterface(Iservice2.class);

       // 启动 Dubbo
        DubboBootstrap.getInstance()
                .application("first-dubbo-consumer")
                .registry(new RegistryConfig("multicast://224.5.6.7:1234"))
                .reference(reference2)
                .start();

        // 获取订阅到的 Stub
        Iservice2 service2 = reference2.get();
        String execute = service2.execute("dubbo");
        System.out.println("--------------------" + execute);*/

    }
}
