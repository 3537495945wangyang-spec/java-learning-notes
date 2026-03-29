package com.gdut.selfgame;

import java.util.Scanner;

public class YuanErci
{
    public static void main(String[] args)
    {
        for (int i = 0; i <5 ; i++) {

        System.out.println(" \n ================================================== \n");
        System.out.println("欢迎来到串月的求解一元二次方程程序，本程序主要是为初中生打造");

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一元二次方程的二次项");
        double a = sc.nextDouble();

        System.out.println("请输入一元二次方程的一次项");
        double b = sc.nextDouble();

        System.out.println("请输入一元二次方程的常数项");
        double c = sc.nextDouble();

        getX(a,b,c);
        }
    }

   public static void getX(double a,double b,double c) {
       if (a == 0) {
           if (b == 0) {
               if (c == 0) {
                   System.out.println("您输入了三个蛋，要我解个毛");
               }
           } else {
               double x = -c / b;
               System.out.println("您输入的是一个小学生都会的一元一次方程 \n " +
                       b + "x" + "+(" + c + ")=" + x);
           }
       } else {

           double delta;
           delta = (b * b) - (4 * a * c);

           if(delta > 0)
           {
               double x1 = (-b + Math.sqrt(delta)/2*a);
               double x2 = (-b - Math.sqrt(delta)/2*a);
               System.out.println("您输入的方程为：" + a + "x^2" + "+("+ b + ")x" + "+(" + c + ")=");
               System.out.println("方程有两个解：" + x1 + "和" + x2);
           }else if(delta == 0)
           {
               double x = -b / (2 * a);
               System.out.println("您输入的方程为：" + a + "x^2" + "+("+ b + ")x" + "+(" + c + ")=");
               System.out.println("方程有一个解：" + x);
           }else
           {
               System.out.println("您输入的方程为：" + a + "x^2" + "+("+ b + ")x" + "+(" + c + ")=");
               System.out.println("该方程无实数解，若想讨论虚数解可关注本程序下一版本");
           }
       }
   }

}
