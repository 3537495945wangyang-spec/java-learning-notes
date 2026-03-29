package com.gdut.loop;

public class ForTest2
{
    public static void main(String[] args)


    {
        System.out.println(sum(100));
        System.out.println(sum2(10));

    }
    public static int sum(int n )
    {
        int sum = 0;
        for (int i = 0; i <=  n ; i++)
        {
            sum += i ; //计算一加到一百

        }
        return sum;
    }

    public static int sum2(int m)
    {
        int sum2 = 0;
        for (int i = 1; i <= m; i += 2)
        {
            sum2 += i;//计算一到十之间所有奇数的和

        }
        return sum2;
    }


}
