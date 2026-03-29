package com.gdut.branch;

import java.util.Scanner;

public class SwitchDemo
{
    public static void main(String[] args)
    {
        //搞清楚switch结构的应用以及写法
        test1();
    }
    public static void test1()
    {
        System.out.println("关于水良哥在高中不同阶段夜修活动调查结果");

        for(int time = 0;time<=2;time++)
        {
            System.out.println("请输入水良哥在高中的哪一个阶段");
            Scanner sc = new Scanner(System.in);
            String stage = sc.next();
            switch(stage)
            {
                case "高一":
                    System.out.println("该时期的水良作为班长喜欢带领整个18班晚修聊天");
                    System.out.println(" \n");
                    break;
                case "高二":
                    System.out.println("该时期的水良喜欢跟别人借电子书晚修的时候看");
                    System.out.println(" \n");
                    break;
                case"高三":
                    System.out.println("该时期的水良喜欢在晚修的时候打王者、刷抖音");
                    System.out.println(" \n");
                    break;
            }
        }
    }
}






