package com.gdut.demo8_executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo2 {

    public static void main(String[] args) {

        //1.使用线程池的实现类ThreadPoolExecutor创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3, 5,
                10, TimeUnit.SECONDS,//线程的存活时间为10秒
                new ArrayBlockingQueue<>(3),//创建一个容量为3的阻塞队列
                Executors.defaultThreadFactory(),//创建一个默认的线程工厂
                new ThreadPoolExecutor.AbortPolicy());//创建一个默认的拒绝策略,无法完成抛出异常

        //2.使用线程池，检测是否能够复用
        Future<String> submit = pool.submit(new MyCallable(100));
        Future<String> submit2 = pool.submit(new MyCallable(200));
        Future<String> submit3 = pool.submit(new MyCallable(300));
        Future<String> submit4 = pool.submit(new MyCallable(400));

        try {
            System.out.println(submit.get());
            System.out.println(submit2.get());
            System.out.println(submit3.get());
            System.out.println(submit4.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}
