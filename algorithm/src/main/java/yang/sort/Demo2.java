package yang.sort;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;

public class Demo2 {{}



    public static void main(String[] args) throws InterruptedException {

        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>(5);
        Task task = new Task(arrayBlockingQueue, Demo2::a);
        Task task2 = new Task(arrayBlockingQueue,Demo2::b);
        Task task3 = new Task(arrayBlockingQueue,Demo2::c);

        task3.start();
        task.start();
        task2.start();

        System.out.println(arrayBlockingQueue.take());

    }

    static class Task extends Thread{

     BlockingQueue<Integer> queue;
     Supplier<Integer> supplier;
     Task(BlockingQueue queue, Supplier<Integer> supplier){
         this.queue = queue;
         this.supplier = supplier;
     }

        @Override
        public void run() {
            queue.add(supplier.get());
        }
    }


    public static int a() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public static int b() {
        System.out.println(System.currentTimeMillis());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2;
    }

    public static int c() {
        System.out.println(System.currentTimeMillis());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 3;
    }

}
