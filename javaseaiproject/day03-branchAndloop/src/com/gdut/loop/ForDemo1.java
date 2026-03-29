package com.gdut.loop;

public class ForDemo1
{
    public static void main(String[] args)
    {
        test2();
    }

    public static void test1()
    {
        for(int i = 0;i<3;i++)
        {
            System.out.println("HelloWorld");
        }
    }

    public static void test2()
    {
        for (int i = 0; i <9 ; i+=2)
        {
            System.out.println("HelloWorld");
        }
    }
}
