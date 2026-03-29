package com.gdut.demo3_generics_InterfaceManager;

public class Demo{
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.add(new Student("S001","正串月",18,'男'));
        studentManager.add(new Student("S002","吕一冂二",18,'男'));
        studentManager.add(new Student("S003","吕二冂三",17,'女'));

        studentManager.print();

        studentManager.remove(new Student("S002","吕一冂二",18,'男'));
        System.out.println(studentManager.find("S001"));
        studentManager.update(new Student("S003","吕二冂三",22,'女'));
        studentManager.print();
    }
}
