package com.gdut.demo8_thread;

public class ThreadPriority {
    public static void main(String[] args) {
        //那个线程调用这个代码，t就代表哪个线程
        Thread t = Thread.currentThread();
        System.out.println(t);//Thread[#1,main,5,main][编号 1,名称 main,优先级 5,所属线程组 main]
        System.out.println(t.getName());//main
        System.out.println(t.getState());//RUNNABLE
        t.setName("sss");
        System.out.println( t); //Thread[#1,sss,5,main]

        //线程的优先级
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.NORM_PRIORITY);//5
        System.out.println(Thread.MAX_PRIORITY);//10
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

        Thread p1 = new Priority("p1");
        Thread p2 = new Priority("p2");
        p1.setPriority(1);
        p2.setPriority(10);
        p1.start();
        p2.start();
    }

}
class Priority extends Thread{
    //创建子类有参构造器
    public   Priority(String name){
        super(name);
    }
    @Override
    public void run() {
        int count =0;
        while(true){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"运行中..."+i);
                //那个线程调用这个代码，t就代表哪个线程
                count++;
            }
            System.out.println(getName()+"运行结束，运行了"+count+"次");
            break;
        }

    }
}
