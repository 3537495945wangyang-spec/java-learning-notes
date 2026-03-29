package com.gdut.extends1demo;
import java.lang.*;
public class Test {
    public static void main(String[] args) {
      /*  1.创建对象，封装老师的数据
        子类可以继承父类的非私有成员
        子类对象其实是由子类和父类的多张设计图共同组合而来的，所以子类对象是完整的*/

        Teacher t = new Teacher();
        t.setName("张沙清");
        t.setSex('男');
        t.setSkill("Java程序设计");

        System.out.println("姓名：" + t.getName());
        System.out.println("性别：" + t.getSex());
        System.out.println("技能：" + t.getSkill());
    }
}

