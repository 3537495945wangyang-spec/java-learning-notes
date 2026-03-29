package com.gdut.constructor;

public class student {
    String name;
    int age;
    char sex;
    //构造器的格式 仅需要一个public 加上一模一样的类名称
        public  student()
    {
        System.out.println("==========无参数构造器=======");


    }

    public  student(String n)
    {
        System.out.println("==========有参数构造器=========");
    }

    public student(String name,int age,char sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }
}
