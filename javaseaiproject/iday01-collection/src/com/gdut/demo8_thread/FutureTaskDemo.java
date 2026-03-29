package com.gdut.demo8_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {


    public static void main(String[] args)  {
        //1.创建Callable接口实现类的对象
        Callable<String> c1 = new MyCallable(50);

        //2.创建FutureTask对象，将Callable接口实现类作为构造参数
        /**
         * 未来任务对象的作用
         * a.本质上是一个Runnable线程任务对象，可以交给Thread对象处理
         * b.可以获取Callable线程执行结束后的结果
         */
         FutureTask<String> f1 = new FutureTask(c1);
        //Runnable f1 = new FutureTask(c1);

        //3.创建Thread对象，将FutureTask对象作为Thread对象的构造参数
        Thread t1 = new Thread(f1);
        t1.start();

        Callable<String> c2 = new MyCallable(100);
        FutureTask<String> f2 = new FutureTask(c2);
        Thread t2 = new Thread(f2);
        t2.start();

        //或许线程完毕之后的结果
        try{
            //如果主线程运行时发现子线程1还没结束，会让出CPU等第一个线程执行完毕再往下执行
            System.out.println(f1.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            System.out.println(f2.get());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

class MyCallable implements Callable<String>{
    private int n ;
    public MyCallable(int n ){
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum +=i;
        }
        return "计算1-"+ n +"的结果是" + sum;
    }
}
