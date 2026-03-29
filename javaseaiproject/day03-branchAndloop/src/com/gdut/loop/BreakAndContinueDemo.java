package com.gdut.loop;

public class BreakAndContinueDemo
{
    public static void main(String[] args)
    {
        tese1();
    }

    public static void tese1()
    {
        for (int i = 0; i < 10; i++)
        {
            if (i == 5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
