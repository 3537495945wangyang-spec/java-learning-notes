package com.gdut.array;

import java.util.Scanner;

public class ArrayDemo2
{
    public static void main(String[] arge)
    {
        double[] scores = intput();
        double max = getMax(scores);
        double min = getMin(scores);
        double average = getAverage(scores);

        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
        System.out.println("平均值是：" + average);
    }

    public static double[] intput()//这里double后面为什么要加上中括号？
    {
        //动态化数组，只确定存储数据的格式和容量
        double [] scores = new double[8];

        //录入八名同学的数据
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"个同学的分数");
            scores [i] = sc.nextDouble();

        }
       return scores;
    }
    public static double getMax(double[] scores)
    {
        double max = scores[0];
        for (int i = 1; i <scores.length ; i++) {
            if(scores[i] > max)
            {
                max = scores[i];
            }

        }
        return max;

    }

    public static double getMin(double[] scores)
    {
        double min = scores[0];
        for (int i = 1; i <scores.length ; i++) {
            if(scores[i] < min)
            {
                min = scores[i];
            }

        }
        return min;

    }

    public static double getAverage(double[] scores)
    {
        double allscore = 0.0;
        for (int i = 1; i < scores.length; i++) {
            double score = scores[i];
            allscore += score;
        }
        double average;
        average = allscore / scores.length;
        return average;
    }
}

