package com.gdut.account;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //初始化登录
        Account account1 = new Account(1,10086.0,0.45, LocalDate.of(2019,5,1));
        System.out.println("尊敬的" +account1.getId()+"号用户，欢迎来到串月银行存储款机");
        System.out.println("您的账户余额为：" + account1.getBalance());

        var operator1 = new AccountOperator(account1);
        operator1.withdraw(450);
        operator1.deposit(6600);
    }
}
