package com.gdut.demo5_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    //Set的特点是：无序（不保证存入顺序）、不可重复。它就像一个数学中的“集合”概念，每个元素都是唯一的。
    public static void main(String[] args) {
        System.out.println("==========HashSet===========");
        Set<String> hashSet = new HashSet<>(5);
        //不存在索引，通过计算元素的 hashCode()来决定存储位置。
        hashSet.add("sdsf");
        //hashSet.add("sdsf");//重复输入，不会加入
        hashSet.add("dsds");
        hashSet.add("dds");
        hashSet.add("ddss");

        //检查存在性，速度飞快
        System.out.println(hashSet.contains("sdsf"));

        //删除元素
        hashSet.remove("dsds");

        //遍历集合
        for(String hash : hashSet){
            System.out.println(hash);
        }

        System.out.println("==========LinkedHashSet ===========");
        Set<String> linkedHashSet = new LinkedHashSet<>(5);
        //1.添加元素时，会记录元素的插入顺序。
        linkedHashSet.add("sdsf");
        //linkedHashSet.add("sdsf");
        linkedHashSet.add("dsds");
        linkedHashSet.add("dds");
        linkedHashSet.add("ddss");

        //2.遍历集合时，会按照插入顺序遍历。
        System.out.println(linkedHashSet);//按照插入顺序排序
        System.out.println(hashSet);//随机排序


        System.out.println("==========TreeSet ===========");
        System.out.println("字符串按照字典顺序排序");
        Set<String> treeSet = new TreeSet<>();
        //TreeSet内部使用 TreeMap来存储元素。TreeMap的节点也是分散在堆内存各处的，通过树的结构（父子关系）来组织。
        //和链表类似，红黑树的节点也是动态创建的。插入一个新元素时，算法会找到合适的位置，创建新节点，并进行必要的旋转来保持树的平衡。
        treeSet.add("Amy");
        treeSet.add("Edward");
        treeSet.add("Bob");
        treeSet.add("David");
        treeSet.add("Charlie");
        treeSet.add("Alice");
        treeSet.add("a");
        treeSet.add("b");
        System.out.println(treeSet);

        System.out.println("数字按照升序排序");
        Set<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(95);
        treeSet1.add(100);
        treeSet1.add(70);
        treeSet1.add(88);
        treeSet1.add(105);
        System.out.println(treeSet1);


        System.out.println("展示范围查找的功能");
        TreeSet<Integer> score = new TreeSet<>(treeSet1);//复制一遍集合
        // 【关键步骤】创建一个新的TreeSet，并用原始集合初始化它
        // 这相当于把scores里的所有元素复制了一份，放到全新的scoreTreeSet里。
        //从此，scoreTreeSet和scores是两个完全独立的对象，互不影响。
        System.out.println(score.tailSet(80));//80之后的所有元素
        System.out.println(score.subSet(80, 100));//80到100之间的元素
        System.out.println(score.last());//集合中最大的元素

    }
}
