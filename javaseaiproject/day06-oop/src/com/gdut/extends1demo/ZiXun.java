package com.gdut.extends1demo;
//咨询师类：子类
public class ZiXun extends People{
    private int number;

    public ZiXun(String name, char sex, int number) {
        super(name, sex);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
