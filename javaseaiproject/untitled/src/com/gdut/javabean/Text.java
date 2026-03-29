package com.gdut.javabean;

public class Text {
    public static void main(String[] args) {
        //掌握JavaBean实体类的作用

        Student s1 = new Student();
        s1.setName("zm");
        s1.setChinese(88.0);
        System.out.println(s1.getName());
        System.out.println(s1.getChinese());

        Student s2 = new Student("ll",70);
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());

        StudentOperator operator= new StudentOperator(s2);
        operator.print();
    }
}
