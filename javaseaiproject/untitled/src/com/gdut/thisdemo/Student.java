package com.gdut.thisdemo;

public class Student {
        String name;
    public void print()
    {
        //this是一个对象，在方法中用于拿到当前对象
        //哪个对象调用这个方法，this就拿到哪个对象
        System.out.println(this);
        System.out.println(this.name);
    }

    public void printhobby(String name)
    {
        System.out.println(this.name + "喜欢"+ name);
    }
}
