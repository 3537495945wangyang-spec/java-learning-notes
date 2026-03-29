package com.gdut.demo5_collection_linkedlistexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
//        优点中间插入和删除速度快（只需修改链接指针）。
//        缺点：随机访问速度慢（必须从头或尾逐个遍历）。
        List<String> linkedList = new LinkedList<>();
        //不能设置容器大小，因为他是链表，自动链接到下一个内容，
        // 不需要自定义一块内存存储，也就没有所谓容器大小

        linkedList.add("dsfsddf");
        linkedList.set(0,"ds");
        linkedList.set(0,"dd");
        System.out.println(linkedList);

        linkedList.addFirst("dd");//加到开头
        linkedList.addLast("dd");//加到结尾
        linkedList.get(3);
        linkedList.hashCode();
        linkedList.remove(2);
        List<String> arrayList = new ArrayList<>(5);
        arrayList.addFirst("dd");
    }
}
