package eventbus;

/**
 * @author Mr.Yang
 * @desc WorldEvent
 * @date 2023/5/12 18:24
 */
public class WorldEvent {

    private int eventNo;

    private String eventName;

    public WorldEvent(int eventNo, String eventName) {
        this.eventNo = eventNo;
        this.eventName = eventName;
    }


    public int getEventNo() {
        return eventNo;
    }

    public void setEventNo(int eventNo) {
        this.eventNo = eventNo;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

}
