package eventbus;

import com.google.common.eventbus.EventBus;

/**
 * @author Mr.Yang
 * @desc EvnetbusTest
 * @date 2022/9/22 16:24
 */
public class EventbusMain {

    public static void main(String[] args) {
        //1.创建事件总线
        EventBus eventBus=new EventBus();
        //2.创建监听器
        GuavaEventListener listener=new GuavaEventListener();
        //3.事件总线注册监听器
        eventBus.register(listener);
        //4.发送事件消息
        eventBus.post(
                new HelloEvent(12,"hello")
        );
        //5.发送完消息，必须取消监听器
        eventBus.unregister(listener);

        //创建新的EventBus隔离事件
//        EventBus eventBus2=new EventBus();
//        GuavaEventListener2 listener2=new GuavaEventListener2();
//        eventBus2.register(listener2);
//        eventBus2.post(new WorldEvent(222,"world"));
//        eventBus2.unregister(listener2);

    }






}
