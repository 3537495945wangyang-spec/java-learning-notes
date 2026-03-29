package com.gdut.demo;

import java.util.Random;
import java.util.Scanner;

public class RandomNumTest
{
    public static void main(String[] args)
    {
        guess();
    }

    public static void guess()
    {
        //int number = (int)(Math.random() * 100) + 1 ;//随机生成【0，100）的随机数 >> 【1，100】
        Random r = new Random();//得到一个随机数变量
        int luckynumber = r.nextInt(100) + 1 ; //随机生成【0，99】的随机数 再加一>> 【1，100】

        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎来到串月的猜数字游戏 \n 游戏规则是随机生成一个1-100之间的整数由您进行猜测");


        int i = 0;
        while(i<10)
        {
            i++;
            System.out.println("这是您的第" + i + "次猜测,您还有" + (10-i) + "次机会");
            System.out.print("请输入您猜测的数据");
            int guessnumber = sc.nextInt();
            if(guessnumber == luckynumber)
            {
                System.out.println("恭喜你，猜对了答案就是" + luckynumber);
                break;
            }else if(guessnumber > luckynumber)
            {
                System.out.println("很遗憾猜错了，数值过大" );
                System.out.println("==============================================");
            }else
            {
                System.out.println("很遗憾猜错了，数值过小");
                System.out.println("==============================================");
            }
        }
    }
}
