package com.gdut.test;

public class DoubleArrayTest1 {
    public static void main(String[] args) {
        start(4);
    }

    public static void start(int n)
    {//定义一个二维数组来存储数据列表
        int [][] start = new int[n][n];
        int num = 1;
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < start[i].length; j++) {
                start[i][j] = num ;
                num++;
            }

        }
        print(start);
        System.out.println();

        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < start.length; j++) {

                //随机生成一个存储数据x y
                int x = (int)(Math.random() * start.length);
                int y = (int)(Math.random() * start.length);

                //先定义一个临时变量存储x y处的数据
                int temp = start[x][y];

                //将i j处数据赋给x y
                start[x][y] = start[i][j];

                //将x y 处数据赋给i j
                start[i][j] = temp;

            }

        }
        print(start);



    }



    public static void print(int[][] start)
    {
        for (int i = 0; i < start.length; i++) {
            int array[] = start[i];
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }
}
