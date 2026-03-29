package com.gdut.method1reference;

import java.util.Arrays;

public class Test3 {
    public static void main(String[]  args) {
        //建立一个字符串数组，生成英文名字
        String [] names = {"Tom","Jerry","Mike","Mary","Lucy","Lily","angle","Andy"};

//        Arrays.sort(names, (String o1, String o2) -> {
//            return o1.compareToIgnoreCase(o2);
//        });
//
//        Arrays.sort(names, ( o1,  o2) -> o1.compareToIgnoreCase(o2));
        //特定类型的参数，前面的参数作为方法的主调营，后面的参数作为方法参数进行入参
        //                 类型名称：：方法名称
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString( names));
    }
}
