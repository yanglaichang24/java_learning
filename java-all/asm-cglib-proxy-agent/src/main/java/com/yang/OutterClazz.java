package com.yang;

public class OutterClazz {

    public void doit() {
        System.out.println(Thread.currentThread());
    }


    public void exec() {
        InnerClazz innerClazz = new InnerClazz();
        InnerClazz innerClazz2 = new InnerClazz();
        InnerClazz innerClazz3 = new InnerClazz();

        innerClazz3.exec();
        innerClazz.exec();
        innerClazz2.exec();
    }


     class InnerClazz {

        void exec() {
            int i = 0;
            do {
                OutterClazz.this.doit();
                i++;
            } while (i < 100000);
        }
    }


}
