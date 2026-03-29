package com.gdut.entends4override;

public class Test {

    public static void main(String[] args) {
    Student s1 = new Student("吕一冂二",18);
    System.out.println(s1);
    System.out.println(s1.toString());
    }
}
class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
