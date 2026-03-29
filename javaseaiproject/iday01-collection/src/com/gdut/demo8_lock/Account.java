package com.gdut.demo8_lock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int id;
    private double balance;
    private final Lock lk = new ReentrantLock();//保护锁对象

    public void drawMoney(double money){
        //拿到当前是谁来取钱
        System.out.println(Thread.currentThread().getName()+"来取钱了");
        lk.lock();//上锁
        //判断余额是否足够
        try {
            if(balance>=money){
                System.out.println(Thread.currentThread().getName()+"取了"+money+"元钱");
                balance-=money;
                System.out.println(Thread.currentThread().getName()+"取钱成功，账户余额为："+balance);
            }else{
                System.out.println(Thread.currentThread().getName()+"取钱失败，余额不足");
            }
        } finally {
            lk.unlock();//解锁,再finally里面，一定要解锁
        }
    }
}
