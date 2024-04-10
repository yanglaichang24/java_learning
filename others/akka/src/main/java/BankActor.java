import akka.actor.UntypedActor;

/**
 * @author Mr.Yang
 * @desc BankActor
 * @date 2022/10/18 13:38
 */
public class BankActor extends UntypedActor {

    private int count;

    @Override
    public void preStart() throws Exception, Exception {
        super.preStart();
        count = 0;
    }

    @Override
    public void onReceive(Object message) throws Throwable {
// 可以使用枚举或者动态代理类来实现方法调用
        if (message instanceof Command) {
            Command cmd = (Command) message;
            switch (cmd) {
                case ADD:
                    //log.info("Add 1 from {} to {}", count, ++count);
                    break;
                case MINUS:
                    //log.info("Minus 1 from {} to {}", count, --count);
                    break;
                case GET:
                    //log.info("Return current count " + getSender());
                    getSender().tell(count, this.getSelf());
                    break;
                default:
                    //log.warn("UnSupport cmd: " + cmd);
            }
        } else {
            //log.warn("Discard unknown message: {}", message);
        }
    }

    enum Command {
        ADD,
        MINUS,
        GET
    }
}
