package yang.dubbo.api;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.registry.zookeeper.ZookeeperRegistry;
import org.apache.dubbo.rpc.protocol.dubbo.DubboProtocol;
import yang.dubbo.IService;
import yang.dubbo.IServiceImpl;

/**
 * @author Mr.Yang
 * @desc Provider
 * @date 2023/3/23 20:06
 */
public class Provider {


    public static void main(String[] args) throws InterruptedException {

        ServiceConfig<Object> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(IService.class);
        serviceConfig.setRef(new IServiceImpl());


        DubboBootstrap dubbo = DubboBootstrap.getInstance()
                .application("dubbo-provide")
                .registry(new RegistryConfig("multicast://224.255.255.1"))
                //.registry(new RegistryConfig("nacos://localhost:8848"))
                .protocol(new ProtocolConfig("dubbo", -1))
                .service(serviceConfig)
                .start();



        Thread.sleep(100000L);


    }


}
