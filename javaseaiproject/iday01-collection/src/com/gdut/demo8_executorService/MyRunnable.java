package com.gdut.demo8_executorService;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
        System.out.println(Thread.currentThread().getName()+"正在运行中:"+i);
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }
}
