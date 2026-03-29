package com.gdut.finaldemo1;

import java.util.ArrayList;
import java.util.List;

public class FinalDemo {

    final String name = "吕一";
    public static final double pi = 3.14;

    public static void main(String[] args) {
        final int a = 10;
        //a = 20;
        //pi = 3.1415;
        System.out.println(a);
        final int[] arr = {1,2,3,4,5};
        //final 修饰的数组，容量不可改变
        //引用地址固定，数组长度固定
        //只能修改元素值，不能改变数组大小
        System.out.println("未改变前的地址" + arr);
        for(int i:arr){
            System.out.print(i + "\t");
        }

        arr[0] = 12;
        arr[2] = 34;
        System.out.println();
        System.out.println("改变数据后的地址" + arr);
        for(int i:arr){
            System.out.print(i + "\t");
        }

        final List<String> list = new ArrayList<>();
        list.add("张三");
        //final 修饰集合，容量可以改变
    }
}
