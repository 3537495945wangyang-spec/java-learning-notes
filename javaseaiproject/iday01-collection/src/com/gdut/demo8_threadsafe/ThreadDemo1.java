package com.gdut.demo8_threadsafe;

public class ThreadDemo1 {
    //目标：模拟线程安全问题
    //多个线程同时访问一个共享资源，且存在修改资源
    //新建一个账户，作为西施和李华的共同账户，存入十万元


    public static void main(String[] args) {
        //新建一个账户，作为西施和李华的共同账户，存入十万元
        Account acc = new Account(001,100000.0);

        //创建两个线程，模拟两个线程同时取钱
        new DrawThread("西施",acc).start();
        new DrawThread("李华",acc).start();
    }
}
