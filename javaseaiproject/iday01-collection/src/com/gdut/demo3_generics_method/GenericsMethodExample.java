package com.gdut.demo3_generics_method;

public class GenericsMethodExample {
    public static void main(String[] args) {
    //学习泛型方法，理解其作用
        //方法中使用了类型参数（Type Parameter）的方法。它允许方法在调用时指定具体的类型，
        // 从而提高代码的复用性、类型安全性和可读性。
        //大部分情况下都为静态方法

        Integer[] arr1 = {1,2,3,4,5};
        //泛型类型不能是基本类型（如 int, double），要用包装类（Integer, Double）
        printArray(arr1);

        String[] arr2 = {"a","b","c"};


        printArray(arr2);

        printHero("张三",'男');
        printHero(256,"hsdoiauh");

        System.out.println(getFirseElement(arr1));
        System.out.println(getFirseElement(arr2));
    }
    //单个类型参数的泛型方法
    public static <T> void printArray(T[] array){
        System.out.println(" ");
        for(T arr:array){

            System.out.print(arr+"\t");
        }
    }
    //多个类型参数的泛型方法
    public static <T,K> void printHero(T Name,K sex){
        System.out.println("英雄的名字是："+Name+"性别是："+sex);
    }
    //带返回值的泛型方法
    public static <T> T getFirseElement(T[] array){
        //泛型方法定义的泛型参数只能在泛型方法当中使用
        if(array.length == 0||array == null){
            return null;
        }
        return array[0];
    }
}

