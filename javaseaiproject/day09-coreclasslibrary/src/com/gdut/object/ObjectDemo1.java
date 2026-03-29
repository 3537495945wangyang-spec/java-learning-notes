package com.gdut.object;

public class ObjectDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
    //目标：学习object类的方法
        // 1.equals,hashcode,toString方法
        Person p1 = new Person("张三",18);
        Person p2 = p1;
        Person p3 = new Person("张三",18);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p3);
        //学习克隆方法

        Person p4 = (Person) p3.clone();
        System.out.println(p4);
    }

}

