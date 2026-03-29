package com.gdut.demo8_executorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {
    public static void main(String[] args) {
        //Executors类创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
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
