package com.gdut.loop;

public class WhileDemo1
{
    public static void main(String[] args) {
        System.out.println("欢迎来到串月的程序 \n 项目内容是一张0.1毫米的纸折叠多少次可以和珠穆朗玛峰一样高");
        System.out.println("需要多少年" + money());
        System.out.println("需要折叠" + zfhight());
        System.out.println("需要折叠" + zfhight2());
    }

    public static void test1()
    {
        int i = 1;
        while(i < 3)
        {
            System.out.println("hello world");
            i++;
        }
    }

    public static int money()
    {
        double money = 10000;
        int year = 0;
        double rate = 0.017;
        while(money <= 20000)
        {
            money = money * (1 + rate);
            year++;

        }
        return year;
    }


    public static int zfhight()
    {
        double height = 0 ;
        double limit = 0.1;
        int cishu = 0;

        while(height <= 8848860.0)
        {
            cishu++;
            height = limit * (1L << cishu);
            //height = limit * Math.pow(2,cishu);//幂运算有这两种表示方法
        }
        return cishu;
    }

    public static int zfhight2()
    {
        double height = 8848860.0 ;
        double limit = 0.1;
        int cishu = 0;

        while(limit <= height)
        {
            cishu++;
            limit *= 2;
        }
        return cishu;
    }
}



