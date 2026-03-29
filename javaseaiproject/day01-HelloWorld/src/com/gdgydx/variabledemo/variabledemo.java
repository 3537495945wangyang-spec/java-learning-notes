package com.gdgydx.variabledemo;

public class variabledemo {
    public static void main(String[] args) {
        printVariable();
        //掌握八种基本数据类型定义变量
    }
    //请帮我设计一个方法打印出八种基本数据类型变量
    public static void printVariable(){
        byte a = 10;
        System.out.println(a);
        short b = 10;
        System.out.println(b);
        //随便写一个整数字面量默认是int类型的，虽然没有超过long范围但是超过int范围就会报错
        //需要解决这个问题，告诉编译器这个数字是long类型的可以在数字后面加上l
        int c = 10;
        System.out.println(c);
        long d = 10;
        long l = 58448512358745l;
        System.out.println(d);
        float e = 1.1f;
        //告诉编译器这个数字是float类型的，需要在数字后面加上f
        System.out.println(e);
        double f = 256.25;
        System.out.println(f);
        char g = 'a';
        System.out.println(g);
        boolean h = true;
        System.out.println(h);
        System.out.println("打印完毕");
    }
}
