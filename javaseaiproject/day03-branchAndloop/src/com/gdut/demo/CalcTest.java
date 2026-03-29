package com.gdut.demo;

import java.util.Scanner;

public class CalcTest
{
    public static void main(String[] args) {

        System.out.println("欢迎来到串月的简易计算器 \n 使用规则是随机输入两个数字和一种运算符（+，-，*,/）");
        Scanner sc = new Scanner(System.in);

        //while (true)无限循环
        //{
            System.out.print("请输入第一个数字");
            double num1 = sc.nextDouble();

            System.out.println("请输入第二个数字");
            double num2 = sc.nextDouble();

            System.out.println("请输入运算符号");
            String operator = sc.next();

            System.out.println("以下为运算过程");
            System.out.println(num1 + operator + num2 + "=" + calc(num1, num2, operator));

            System.out.println("---------------------------------------------");

        //}
    }

    public static double calc(double num1,double num2,String operator)
    {

            double result = 0;
            switch (operator) {

                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("输入的运算符有误");
            }
            return result;

    }

}
