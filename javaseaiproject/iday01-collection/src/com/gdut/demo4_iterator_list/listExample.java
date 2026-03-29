package com.gdut.demo4_iterator_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        // 获取迭代器
        //Iterator<元素类型> 迭代器变量名 = 集合对象.iterator();
        Iterator<String> iterator = names.iterator();

        System.out.println("=== 使用迭代器遍历 List ===");
        // 使用 while 循环遍历
        while (iterator.hasNext()/*是否存在下一项*/) {
            String name = iterator.next();/*返回下一个元素*/
            System.out.println(name);
        }
    }
}
