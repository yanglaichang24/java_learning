/*
import akka.actor.ActorContext;
import akka.actor.ActorRef;
import akka.actor.UntypedActor;
import scala.Option;
import scala.PartialFunction;
import scala.runtime.BoxedUnit;

*/
/**
 * @author Mr.Yang
 * @desc BankActor
 * @date 2022/10/18 13:38
 *//*

public class BankActor extends UntypedActor {

    private int count;

    @Override
    public ActorRef sender() {
        return super.sender();
    }

    @Override
    public void aroundReceive(PartialFunction<Object, BoxedUnit> receive, Object msg) {
        super.aroundReceive(receive, msg);
    }

    @Override
    public void aroundPreStart() {
        super.aroundPreStart();
    }

    @Override
    public void aroundPostStop() {
        super.aroundPostStop();
    }

    @Override
    public void aroundPreRestart(Throwable reason, Option<Object> message) {
        super.aroundPreRestart(reason, message);
    }

    @Override
    public void aroundPostRestart(public Throwable reason) {
        super.aroundPostRestart(reason);
    }

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

    @Override
    public ActorContext context() {
        return null;
    }

    @Override
    public ActorRef self() {
        return null;
    }

    enum Command {
        ADD,
        MINUS,
        GET
    }
}
*/
