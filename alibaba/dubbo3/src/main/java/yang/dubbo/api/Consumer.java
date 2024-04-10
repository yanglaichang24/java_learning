package yang.dubbo.api;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import yang.dubbo.IService;


/**
 * @author Mr.Yang
 * @desc Comsumer
 * @date 2023/3/23 20:07
 */
public class Consumer {

    public static void main(String[] args) {

        ReferenceConfig<IService> reference = new ReferenceConfig<>();
        reference.setInterface(IService.class);

        DubboBootstrap.getInstance()
                .application("dubbo-consumer")
                .registry(new RegistryConfig("multicast://224.255.255.1"))
                //.registry(new RegistryConfig("nacos://localhost:8848"))
                .protocol(new ProtocolConfig("dubbo",-1))
                .reference(reference)
                .start();


        IService iService = reference.get();

        System.out.println(iService.execute("xxxx"));

    }


}
