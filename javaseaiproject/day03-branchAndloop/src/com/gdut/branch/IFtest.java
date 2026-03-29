package com.gdut.branch;

public class IFtest
{
    public static void main(String[] args)
    {
        test1();
    }

    public static void test1()
    {
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        if  (red)
        {
            System.out.println("红灯停");

        }
        else if (yellow)
        {
            System.out.print("黄灯等一等");
        }
        else
        {
            System.out.println("绿灯行");
        }
    }
}
