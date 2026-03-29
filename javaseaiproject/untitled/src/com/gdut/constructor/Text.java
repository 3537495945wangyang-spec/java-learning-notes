package com.gdut.constructor;

public class Text {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("吕一冂二");


        student s3 = new student("zm",18,'男');
        System.out.println(s3.name);
    }

}
