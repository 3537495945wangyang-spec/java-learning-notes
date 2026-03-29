package com.gdut.demo3_generics_wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 23, 45));
        list1.add(3,2323);
        list1.indexOf(1);
        print(list1);

        List<String> list2 = Arrays.asList("dsdf","dssa");
        print(list2);

        List<Integer> list3 = Arrays.asList(1,2,3,45,67,4);
        sum(list3);
        List<Double> list4 = Arrays.asList(1.2,2.4,4.5,32.2);
        sum(list4);

        List<Number> list5 = new ArrayList<>();
        List<Object> list6 = new ArrayList<>();
        addNumber(list5);
        addNumber(list6);
    }

    public static void print(List<?> list){
        //希望写一个方法能接受 List<Integer>、List<String>等各种 List<T>
        //就可以使用通配符 List<?>
        for(Object o:list){
            System.out.println(o);
        }
    }
    //PECS = Producer Extends, Consumer Super
    public static  void sum(List<? extends Number> list){
        //<? extends T > 上限通配符：只能是 T或其子类 适合用于读取数据
        double sum = 0.0;
        for (Number number : list) {
            sum += (double)number;
        }
    }

    public static void addNumber(List<? super Integer> list){
        //下限通配符：只能是 T或其父类 适合用于写入数据
        for (int i = 0; i <4 ; i++) {//
            list.add(i);
        }
    }
}
