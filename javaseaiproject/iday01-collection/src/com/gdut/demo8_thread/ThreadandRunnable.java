package com.gdut.demo8_thread;

public class ThreadandRunnable  {
    //main本身就是一种主线程
    //主线程最好放在子线程之后，这样才能体现多线程
    public static void main(String[] args) throws InterruptedException{
        //线程任务
        Runnable t2 = new ThreadDemo2();
        //将线程任务包赚成线程对象
        Thread A = new Thread(t2,"运动员A");
        /**public Thread(Runnable target, String name)
         * 没有创建 Thread 的子类，而是直接使用 Thread类的构造方法，所以不需要重写任何构造方法。
         */
        Thread B = new Thread(t2,"运动员B");
        A.start();
        B.start();

        Thread t1A = new ThreadDemo1("运动员A");
        /**public Thread(  String name)
         * ThreadDemo1成为了 Thread的子类。由于你没有定义任何构造方法，Java 会提供一个默认的无参构造方法，
         * 但这个默认构造方法只会隐式调用 super()（即 Thread()无参构造）。
         * 但是 Thread类没有无参构造方法！它的所有构造方法都需要参数。因此编译器会报错，
         * 除非你显式定义一个构造方法并调用合适的父类构造方法。
         */
        Thread t1B = new ThreadDemo1("运动员B");
        t1A.start();
        t1B.start();



    }
}
 class ThreadDemo2 implements Runnable{
    //适合多个相同线程处理同一份资源的情况
    @Override
    public void run() {
        for (int i = 0; 100 > i; i++) {
            System.out.println(Thread.currentThread().getName()+"\t已经跑了\t"+ i+"\t 米");
            try {
                Thread.sleep((int)(Math.random()*100));//拖慢程序进行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(Thread.currentThread().getName()+"到达终点");
    }

}

class ThreadDemo1 extends  Thread{
    //不能再继承其他类
    public ThreadDemo1(String name){
        super(name);
   }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"\t已经跑了\t"+ i+"\t 米");
            try {
                Thread.sleep((int)(Math.random()*100));//拖慢程序进行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(Thread.currentThread().getName()+"到达终点");
    }
}
