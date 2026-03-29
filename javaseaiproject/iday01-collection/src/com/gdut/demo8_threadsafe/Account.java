package com.gdut.demo8_threadsafe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int id;
    private double balance;

    public void drawMoney(double money){
        //拿到当前是谁来取钱
        System.out.println(Thread.currentThread().getName()+"来取钱了");
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
