package com.gdut.account;

import java.time.LocalDate;

public class Account {
    private int id;//账户的id
    private double balance;//账户的余额
    private double annulRate;//存款的年利率
    private LocalDate dateCreate;//开户日期

    public Account(){}
    public Account(int id,double balance,double annulRate,LocalDate dateCreate){
        this.id = id;
        this.balance = balance;
        this.annulRate = annulRate;
        this.dateCreate = dateCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnulRate() {
        return annulRate;
    }


    public void setAnnulRate(double annulRate) {
        this.annulRate = annulRate;
    }
    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }
}
