package com.gdut.demo;

public class PrimeNumberText
{
    public static void main(String[] args)
    {
        System.out.println("欢迎来到串月的找素数程序 \n 下面将为您输出101-200之间的素数");
        for (int i = 101; i <=200 ; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n)//这里的n就是main方法里面的i
    {
        for (int r = 2; r <= Math.sqrt(n) ; r++)
        {
            if (n % r == 0)
            {
                return false;
            }
        }
        return true;
    }
}
