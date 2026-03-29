package com.gdut.demo;

import java.util.Scanner;

public class BmiandBmrTest
{
    public static void main(String[] args)
    {
        //1）让用户输入基本信息

        System.out.println("欢迎来到串月的BMI和BMR计算程序 \n 请输入您的基本信息");


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身高；");


        double height = sc.nextDouble();
        System.out.println("请输入您的体重；");

        double weight = sc.nextDouble();
        System.out.println("请输入您的性别：");
        String sex = sc.next();

        System.out.println("请输入您的年龄");
        int age = sc.nextInt();

        double bmi = BMI(height,weight);
        System.out.println("您的BMI值为：" + bmi);

        double bmr = BMR(height,weight,age,sex);
        System.out.println("您的BMR值为：" + bmr);
    }

    public static double BMI(double height,double weight)
    {
        double BMI = weight/(height * height);
        return BMI;
    }

    public static double BMR(double height,double weight,int age,String sex)
    {
        double BMR = 0;
        if(sex.equals("男"))
        {
            BMR = 13.7 * weight + 5 * height - 6.8 * age + 66;
        }
        else
        {
            BMR = 9.6 * weight + 1.8 * height - 4.7 * age + 655;
        }
        return BMR;


        
    }
}
