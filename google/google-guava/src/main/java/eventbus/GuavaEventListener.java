package eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @author Mr.Yang
 * @desc GuavaEventListener
 * @date 2023/5/12 18:23
 */
public class GuavaEventListener {


    @Subscribe
    public void subscribeHelloEvent(HelloEvent event){
        System.out.println("接收到 helloEvent,name:"+event.getEventName());
        System.out.println("处理 helloEvent,eventNo:"+event.getEventNo());
    }


    @Subscribe
    public void processObject(Object object) {
        System.out.println("process common event, class:" + object.getClass().getSimpleName());
    }


    @Subscribe
    public void test(Object object) {
        System.out.println("process222 common event, class:" + object.getClass().getSimpleName());
    }


}
