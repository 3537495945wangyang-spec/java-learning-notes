package com.gdut.demo3_generics_Class;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //在定义类、接口、方法时，同时声明一个或者多个类型变量
        //当你创建一个泛型类的实例，或者在泛型方法中使用类型参数时，你需要为这个类型参数指定一个具体的实际类型。

        //没有泛型时
        List list = new ArrayList();
        list.add("hello");
        list.add(10086);
        System.out.println( (String) list.get(0));
        //System.out.println( (String) list.get(1));//抛出异常ClassCastException

        //泛型
        //[接口/类名]<[类型参数]> [变量名] = new [实现类名/具体类名]<>();
        //           左侧：声明部分          右侧 实例化部分
           List<String>         list1 = new   ArrayList<>();
        list1.add("hello");
        list1.add("world");
//        list1.add(10086); 报错：类型不匹配
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
    }
}


