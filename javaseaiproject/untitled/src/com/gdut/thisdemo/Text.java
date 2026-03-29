package com.gdut.thisdemo;

public class Text {
    public static void main(String[] args) {
        //认识this关键字，搞清楚其应用场景

        Student s1 = new Student();
        s1.name = "zhangming";
        s1.print();
        System.out.println(s1);
        s1.printhobby("wangshixin");

        System.out.println("=====================");
        Student s2 = new Student();
        s2.print();
        System.out.println(s2);
    }
}
