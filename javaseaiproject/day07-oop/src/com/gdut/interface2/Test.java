package com.gdut.interface2;

public class Test {
    public static void main(String[] args) {
    zhongdan zd = new Hero();
    fuzhu fz = new Hero();
    teacher t = new Hero();

    }
}

interface zhongdan{}
interface fuzhu{}
class teacher{}

class Hero extends teacher implements zhongdan, fuzhu{
    public void show(){
        System.out.println("Hero show");
    }
}
