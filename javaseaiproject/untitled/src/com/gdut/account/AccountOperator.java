package com.gdut.account;

public class AccountOperator {
    Account account1;
    public AccountOperator(Account account1){
        this.account1 = account1;
    }

    public void withdraw(double amount){
        if (amount > account1.getBalance()){
            System.out.println("余额不足");
        }else{
            account1.setBalance(account1.getBalance() - amount);
            System.out.println("取款"+amount +"成功，余额为：" + account1.getBalance());
        }
    }
    public void deposit(double amount){
        account1.setBalance(account1.getBalance() + amount);
        System.out.println("存款"+amount+"成功，余额为：" + account1.getBalance());
    }
}
