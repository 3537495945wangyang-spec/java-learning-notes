package com.gdut.demo8_synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int id;
    private double balance;

    //目标：线程同步方式一，同步代码块
    public void drawMoney(double money){
        System.out.println(Thread.currentThread().getName()+"来取钱了");
        //拿到当前是谁来取钱
        synchronized (this) {
            //对于实例方法推荐使用this作为锁对象
            //对于静态方法推荐使用类名.class作为锁对象
            //随便选择唯一对象，会影响其他线程，会造成线程不安全
            //判断余额是否足够
            if(balance>=money){
                System.out.println(Thread.currentThread().getName()+"取了"+money+"元钱");
                balance-=money;
                System.out.println(Thread.currentThread().getName()+"取钱成功，账户余额为："+balance);
            }else{
                System.out.println("取钱失败，余额不足");
            }
        }
    }

    //目标：线程同步方式二，同步方法
    public synchronized void drawMoney2(double money){

            System.out.println(Thread.currentThread().getName()+"来取钱了");
            if(balance>=money){
                System.out.println(Thread.currentThread().getName()+"取了"+money+"元钱");
                balance-=money;
                System.out.println(Thread.currentThread().getName()+"取钱成功，账户余额为："+balance);
            }else{
                System.out.println("取钱失败，余额不足");
            }

    }
}
