package com.gdut.demo8_thread;

public class ThreadSleepandJoin {
    public static void main(String[] args)  {

        Thread t1 = new MyThread();
        t1.start();

        for(int i = 0; i < 10; i++){
            if(i == 1){
                try {
                    //插队，让t1线程先结束，再继续执行主线程
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("main主线程"+i);
          /*  try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/
        }

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("子线程" +i);

        }
    }
}
