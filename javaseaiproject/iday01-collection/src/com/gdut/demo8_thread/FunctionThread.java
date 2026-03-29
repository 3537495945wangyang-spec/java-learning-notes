package com.gdut.demo8_thread;

public class FunctionThread {
    public static void main(String[] args) {
    Runnable r1 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程1启动：" + i);
            }
        }
    };
    Thread t1 = new Thread(r1);
    t1.start();


     new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2启动：" + i);
                }
            }
        }).start();



        new Thread(() -> {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程3启动：" + i);
        }

    }).start();

        for (int i = 0; i <5 ; i++) {
            System.out.println("主线程启动：" +i);
        }

    }
}
