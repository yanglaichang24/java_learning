package eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @author Mr.Yang
 * @desc GuavaEventListener2
 * @date 2023/5/12 18:25
 */
public class GuavaEventListener2 {

    @Subscribe
    public void subscribeHelloEvent2(WorldEvent event){
        System.out.println("接收到 WorldEvent,name:"+event.getEventName());
        System.out.println("处理 WorldEvent,eventNo:"+event.getEventNo());

    }

    @Subscribe
    public void processObject(Object object) {
        System.out.println("process common event, class:" + object.getClass().getSimpleName());
    }


}
