package com.yang;

public class UnsafeBank {

    public static void main(String[] args) {
        Account account = new Account(100, "结婚基金");
        Draw boy = new Draw(account, 50, "boy");
        Draw girl = new Draw(account, 100, "girl");
        boy.start();
        girl.start();
    }

    static class Account {
        int money;
        String name;

        public Account(int money, String name) {
            this.money = money;
            this.name = name;
        }
    }

    static class Draw extends Thread {
        Account account;//账户
        int drawingMoney; //取了多少钱
        int nowMoney; //现在手里有多少钱
        String name;

        public Draw(Account account, int drawingMoney, String name) { //现在账户余额，取多少钱，手里有多少钱
            this.account = account;
            this.drawingMoney = drawingMoney;
            this.name = name;
        }

        @Override
        public void run() {
            if (this.account.money - this.drawingMoney < 0) {
                System.out.println(this.name + ",您的余额不足");
                return;
            }
            try {
                Thread.sleep(3000);    //sleep放大问题的发生性，查缺补漏
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.account.money -= this.drawingMoney;//找到account堆内存地址，改变银行余额
            this.nowMoney += this.drawingMoney;
            System.out.println(this.name + "取到了" + this.nowMoney);
        }
    }


}
