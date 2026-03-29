

package com.gdut.array;

public class ArrayDemo3
{
    public static void main(String[] arge)
    {
        start();
    }

    public static void start()
    {
        //创建一个初始化数组储存54张牌
        String[] poker = new String[54];

        //准备四种花色和数字，再开始作牌存储到数组中
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        //先遍历点数再遍历花色
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = 0; i1 < colors.length; i1++) {
                poker[index] = colors[i1] + numbers[i];
                index++;
            }
        }
        poker[index++] = "小🃏";
        poker[index] = "大🃏";
        //这里的poker[index++]都是先赋值完再加上1也就是等同于poker[index],index++

        for (int i = 0; i < poker.length; i++) {

            if( (i+1) % 4 == 0)
            {
                System.out.printf("%-10s%n" , poker[i]);
            }else
            {
                System.out.printf("%-10s" , poker[i]);
            }


        }

        /*for (int i = 0; i < poker.length; i++) {


            int random = (int) (Math.random() * 54);
            System.out.println(poker[random]);
        }*/
    }

}
