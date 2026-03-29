package com.gdgydx.variable;

import java.sql.SQLOutput;

public class variabledemo1 {
    public static void main(String[] args) {
        printvariable();
        //认识变量
        }
        //定义一个方法来学习变量的意义
        public static void printvariable(){
        int a = 10;
        System.out.println(a);

        System.out.println(a);

        System.out.println("===============================");
        //定义一个小数变量存储学生的成绩
            double score = 89.5;
            System.out.println(score);
            //研究变量的特点
            int age = 18;
            age = 19;
            System.out.println(age);//赋值是从右往左看

            age = age + 1;
            System.out.println(age);

         System.out.println("===============================");
            //定义微信红包的初始值为555元
            double money = 555;
            System.out.println(money);
            //花出去56元
            money = money - 56;
            System.out.println(money);
            //又收到4895元
            money = money + 4895;

            System.out.println(money);




        }
    }
