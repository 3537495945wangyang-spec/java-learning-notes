package com.gdut.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String name;
    private int phoneNumber;
    private double balance;

    //预存金额
    public void deposit(double money){
        balance += money;
    }
    //消费金额
    public void consume(double money){
        balance -= money;
    }


}
