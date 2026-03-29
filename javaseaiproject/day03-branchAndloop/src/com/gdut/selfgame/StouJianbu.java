package com.gdut.selfgame;

import java.util.Scanner;

public class StouJianbu
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 3 ; i++)
        {

        System.out.println("欢迎来到串月的石头剪刀布小游戏,你将于虚拟用户果冻进行比赛 " +
                "\n 请用户输入 0（石头） 1（剪刀） 2（布）");
        Scanner sc = new Scanner(System.in);
        System.out.println("经过深思熟虑之后决定出什么呢");
        int user =sc.nextInt();
        game(user);
        }
    }
    public static void game(int user)
    {

        int computer = (int)(Math.random() * 3);
        switch(user)
        {
            case 0:
                System.out.println("你出的是石头");
                break;
            case 1:
                System.out.println("你出的是剪刀");
                break;
            case 2:
                System.out.println("你出的是布");
        }


        switch(computer)
        {
            case 0:
                System.out.println("果冻出石头");
                break;
            case 1:
                System.out.println("果冻出剪刀");
                break;
            case 2:
                System.out.println("果冻出布");
        }

        if(user == computer)
        {
            System.out.println("你和果冻打成了平局");
            System.out.println("\n ================================================== \n");
        }else if(user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0)
        {
            System.out.println("恭喜你打败了果冻，允许加饭");
            System.out.println("\n ================================================== \n");
        }
        else
        {
            System.out.println("很遗憾你连果冻 都打不过，不准加饭");
            System.out.println("\n ================================================== \n");
        }
    }
}
