package com.yang;

public class FatherClazz {

    private int account = 0;

    private static int b = 0;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void doit(int i) {
        this.account -= i;
    }

    public void doit() {
        this.account++;
    }

    public void plus(int i) {
        this.account = this.account + i;
    }

    public void sub(int i) {
        this.account = this.account - i;
    }


    public static void main(String[] args) throws InterruptedException {
        FatherClazz fatherClazz = new FatherClazz();
        //AtomicInteger a = new AtomicInteger(0);
        fatherClazz.exec();
        //Thread.sleep(5000);
        //System.out.println(fatherClazz.getAccount());

//        new Thread(() -> {
//            for(int i=0;i<1000000;i++){
//               fatherClazz.plus(1);
//            }
//        }).start();
//
//        new Thread(() -> {
//            for(int i=0;i<1000000;i++){
//                fatherClazz.sub(1);
//            }
//        }).start();

        Thread.sleep(5000);
        System.out.println(fatherClazz.getAccount());


//        new Thread(() -> {
//            for(int i=0;i<1000000;i++){
//                b++;
//                a.incrementAndGet();
//            }
//        }).start();
//
//        new Thread(() -> {
//            for(int i=0;i<1000000;i++){
//                b++;
//                a.incrementAndGet();
//            }
//        }).start();
//
//        Thread.sleep(5000);
//        System.out.println("b=" + b);
//        System.out.println("a=" + a);
        //System.out.println(fatherClazz.getAccount());
    }


    public void exec() {
        InnerClazz innerClazz =  new InnerClazz("one", 50);
        InnerClazz innerClazz2 = new InnerClazz("two", 100);

        innerClazz.exec();
        innerClazz2.exec();

    }


    class InnerClazz implements Runnable {

        Thread t;
        int m;
        String name;

        InnerClazz() {
            t = new Thread(this);
        }

        InnerClazz(String name, int m) {
            t = new Thread(this, name);
            this.m = m;
            this.name = name;
        }

        void exec() {
            t.start();
        }

        @Override
        public void run() {
            for(int i=0;i<1000000000;i++){
                 doit();
            }
        }
    }


}
