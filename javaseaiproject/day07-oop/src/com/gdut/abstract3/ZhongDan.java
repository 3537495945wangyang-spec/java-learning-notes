package com.gdut.abstract3;

public abstract class ZhongDan {

    //抽象类也可以有普通方法，普通方法里面可以调用抽象方法
    public void process(){
        System.out.println("中单开局要抢线权");
        Fourgrade();
        System.out.println("中单后期要多团战");
    }
    public abstract void Fourgrade();
}
