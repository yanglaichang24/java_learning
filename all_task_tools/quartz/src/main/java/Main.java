import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author Mr.Yang
 * @desc Main
 * @date 2022/10/26 13:52
 */
public class Main {


    public static void main(String[] args) throws SchedulerException, InterruptedException {
        //Scheduler
        Scheduler defaultScheduler = StdSchedulerFactory.getDefaultScheduler();
        defaultScheduler.start();
        System.out.println("start");

        //JobDetail
        JobDetail jobDetail = JobBuilder.newJob(JobDemo.class)
                .withIdentity("a", "b")
                .build();

        //Trigger
        CronTrigger build = TriggerBuilder.newTrigger()
                .withIdentity("t1", "t2")
                .withSchedule(
                        CronScheduleBuilder.cronSchedule("0/2 * * * * ?")
                ).build();

        defaultScheduler.scheduleJob(jobDetail,build);

        Thread.sleep(10000);
        TimeUnit.SECONDS.sleep(10);
        defaultScheduler.shutdown();
    }
}
