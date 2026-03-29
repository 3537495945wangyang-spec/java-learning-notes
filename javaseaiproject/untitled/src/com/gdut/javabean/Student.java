package com.gdut.javabean;

public class Student {
    private String name;
    private double chinese;

    //无参构造器
    public Student() {
    }
    //有参构造器
    public Student(String name, double chinese)
    {
        this.name=name;
        this.chinese=chinese;
    }
    //getter和setter都必须存在
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }
}

