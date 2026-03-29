package com.gdut.javabean;

public class StudentOperator {
    private Student s;//用于记住将来要操作的学生对象
    public StudentOperator(Student s)
    {
        this.s=s;
    }
    public void print(){
        System.out.println("该学生的语文成绩为" + s.getChinese());
    }
}
