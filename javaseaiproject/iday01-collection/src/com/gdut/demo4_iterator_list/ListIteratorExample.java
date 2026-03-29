package com.gdut.demo4_iterator_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> language = new ArrayList<>(Arrays.asList("java","c++","python"));

        System.out.println("正向遍历");
        ListIterator<String> listIterator = language.listIterator();
        while(listIterator.hasNext()){
            int index = listIterator.nextIndex();
            String str = listIterator.next();
            System.out.println(index+str);
        }

        System.out.println("反向遍历");
        while(listIterator.hasPrevious()){
            int index = listIterator.previousIndex();
            String str = listIterator.previous();
            System.out.println(index+str);
        }
    }
}
