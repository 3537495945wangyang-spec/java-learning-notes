package com.gdut.selfgame;

import java.util.Scanner;

public class CalcEvery
{
    public static void main(String[] args) {
        System.out.println("欢迎来到串月的求和程序 \n " +
                "请输入一个数字，本程序将求出这个数字的各个位次数字和");
        Scanner sc = new Scanner(System.in);
        System.out.println("请用户输入想要计算的数字");
        int num = sc.nextInt();
        calc(num);
    }
    public static void calc(int num)
    {
        int result = 0;
        num = Math.abs(num);//将复数取绝对值，使得程序对于正负数皆可使用
        while(num > 0){
            int num1;
            num1 = num %10;
            num  /= 10;
            result += num1;
        }
        System.out.println("该数字的和为：" + result);
    }
}
