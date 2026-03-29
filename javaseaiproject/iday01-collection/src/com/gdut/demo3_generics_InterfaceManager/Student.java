package com.gdut.demo3_generics_InterfaceManager;

import java.util.Objects;

public class Student{
     String id;
     private String name;
     int age;
     char sex;
     public Student(){}

     public Student(String id, String name, int age, char sex) {
         this.id = id;
         this.name = name;
         this.age = age;
         this.sex = sex;
     }

    @Override
    public boolean equals(Object obj) {
        // 1. 如果是同一个对象，肯定相等
        if (this == obj) return true;

        // 2. 如果传入的是 null 或者类型不对，肯定不相等
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. 比较关键字段（这里我们用 id 作为唯一标识）
        Student other = (Student) obj;
        //return Objects.equals(id, other.getId());
        return Objects.equals(id, other.id);//在 Java 中，私有成员（private）只能在同一个类内部被访问
        //由于 equals 方法是在 Student 类内部定义的，因此它可以访问其他 Student 对象的私有字段 id

        //Objects.equals()方法返回两个对象是否相等。如果两个对象相等，则返回true。否则返回false。
        //循环在Manage里面完成

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
         return "Student{" +
                 "id='" + id + '\'' +
                 ", name='" + name + '\'' +
                 ", age=" + age +
                 ", sex=" + sex +
                 '}';
    }
}
