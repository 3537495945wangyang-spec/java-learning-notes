package com.gdut.capsulation;

public class Teacher {
    //1隐藏使用private关键字进行修饰成员变量
    //只能在本类中访问
    String name;
    private int age;
    private String subject;
    private String grade;

    //合理暴露，使用public修饰的get和set

    //赋值方法
    public void setAge(int age){
        if(age>0 && age <120)
        {
           this.age = age;
        }else
        {
            System.out.println("您输入的值非法！");
        }
    }
    //获取方法
    public int getAge(){
        return age;
    }
}
