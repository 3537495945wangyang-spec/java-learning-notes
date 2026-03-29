package com.gdut.code;

import java.util.Arrays;

public class CodeDemo {
    public String age;
    public static String NAME;
    public static String[] name = new String[12];
    //静态代码块，与类一起加载，只执行一次
    static{
        System.out.println("静态代码块");
        NAME = "张三";//对静态变量进行赋值
        name[0] = "张三";
        name[1] = "张三";
        name[2] = "张三";
    }
    //实例代码块，每次创建对象都会执行一次
    {
        System.out.println("实例代码块");
        age = "18";
    }

    public static void main(String[] args) {
        System.out.println("main方法");
        System.out.println(Arrays.toString(name));
        new CodeDemo();
        new CodeDemo();
        new CodeDemo();
    }
}
