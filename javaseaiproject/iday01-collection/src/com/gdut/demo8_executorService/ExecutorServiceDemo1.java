package com.gdut.demo8_executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {

    public static void main(String[] args) {

        //1.使用线程池的实现类ThreadPoolExecutor创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3, 5,
                10, TimeUnit.SECONDS,//线程的存活时间为10秒
                new ArrayBlockingQueue<>(3),//创建一个容量为3的阻塞队列
                Executors.defaultThreadFactory(),//创建一个默认的线程工厂
                new ThreadPoolExecutor.AbortPolicy());//创建一个默认的拒绝策略,无法完成抛出异常

        //2.使用线程池，检测是否能够复用
        Runnable target = new MyRunnable();
        pool.execute(target);//提交第一个任务 创建第一个线程，自动启动线程
        pool.execute(target);//提交第二个任务 创建第二个线程，自动启动线程
        pool.execute(target);//提交第三个任务 创建第三个线程，自动启动线程
        pool.execute(target);//复用线程
        pool.execute(target);//复用线程
        pool.execute(target);//队列等待
        pool.execute(target);//触发临时线程
        pool.execute(target);//触发临时线程
        pool.execute(target);//异常处理

        //3.关闭线程池
//        pool.shutdown();//等所有任务执行完再关闭线程池
//        pool.shutdownNow();//立即关闭，不管是否执行完毕
    }
}
