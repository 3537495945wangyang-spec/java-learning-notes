package com.gdut.demo;


public class King extends Customer {


    public King(){}

    public King(String name, int phoneNumber, double balance){
        super(name, phoneNumber, balance);
    }


    @Override
    public void consume(double money){
        if(getBalance() < money){
            System.out.println("您的卡内余额是" + getBalance() +"当前余额不足，请充值");
            return;
        }
        System.out.println("您当前消费的金额为" + money);
        System.out.println("优惠八折之后为" + money * 0.8);
        setBalance(getBalance() - money * 0.8);
        System.out.println("您当前的King卡消费余额为" + getBalance());
        if(money * 0.8 >= 200){
            System.out.println("您当前的消费超过200，将赠送您一瓶二锅头");
        }else{
            System.out.println("您当前消费不足200元，无法赠送礼物");
        }
        System.out.println("欢迎您下次光临！" + "\n");
    }

}
