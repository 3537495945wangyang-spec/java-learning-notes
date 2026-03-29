package com.gdut.demo;

public class Queen extends Customer {

    public Queen(){}

    public Queen(String name, int phoneNumber, double balance){
        super(name, phoneNumber, balance);
    }

    @Override
    public void consume(double money) {
        if(getBalance() < money){
            System.out.println("您的卡内余额是" + getBalance() +"当前余额不足，请充钱");
            return;
        }
        System.out.println("您当前消费的金额为" + money);
        System.out.println("优惠八折之后为" + money * 0.9);
        setBalance(getBalance() - money * 0.9);
        System.out.println("您当前的Queen卡消费余额为" + getBalance());
        if(money * 0.8 >= 200){
            System.out.println("您当前的消费超过200，将赠送您一箱雪花啤酒");
        }else{
            System.out.println("您当前消费不足200元，无法赠送礼物");
        }
        System.out.println("欢迎您下次光临！" + "\n");
    }
}
