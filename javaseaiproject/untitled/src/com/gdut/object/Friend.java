package com.gdut.object;
//好朋友类，串月的好朋友对象的模板
public class Friend {
    String name;
    String university;
    int age;
    double height;
    double weight;
    public void print()
    {
        System.out.println("姓名：" + name + "\t大学：" + university + "\t年龄：" + age + "\t身高：" + height + "\t体重：" + weight);
    }
}
