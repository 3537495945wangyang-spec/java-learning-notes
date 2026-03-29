package com.gdut.branch;

import java.util.Scanner;

public class IFdemo {
    public static void main(String[] args) {
        //目标：认识if语句
        demo1();
        demo2();
        demo3();
    }

    public static void demo1() {
        int age = 5;
        if (age >= 18) {
            System.out.println("可以投票");
        } else
            System.out.println("回去加饭 ");
    }

    public static void demo2() {
        int money = 88;
        if (money >= 90) {
            System.out.println("全部转账给吕一");
        } else {
            System.out.println("等攒够了再转账给吕一");
        }
    }

    public static void demo3() {
        System.out.println("请输入您的高考成绩");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 600)
        {
            System.out.println("您的成绩为双一流水准");
        }
        else if (score >= 534 && score <= 600)
        {
            System.out.println("您的成绩为普通一本");
        }
        else if (score >= 490 && score <= 533)
        {
            System.out.println("您的成绩为普通二本");
        }
        else if (score <= 489 && score >= 300)
        {
            System.out.println("您的成绩为垃圾大专");
        }else
        {
            System.out.println("很遗憾，您没书读");
        }
    }
}
