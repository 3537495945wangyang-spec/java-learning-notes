package com.gdut.innerclass;

public class Outer {
    public static String NAME = "LVYI";
    public void show1(){
        System.out.println("show1()");
    }
    private int age;
    public void run(){}
    //成员内部类，没有static修饰，属于外部类的对象持有
    public class Inner{
        public void show(){

            System.out.println("show()");
            //1.成员内部类可以直接访问外部类的静态成员，静态方法，
            System.out.println(NAME);
            show1();
            // 也可以直接访问外部类的实例成员，实例方法
            System.out.println(age);
            run();
        }
    }
    //静态内部类
    public static class StaticInner{
        public void show(){
            System.out.println("StaticInner.show()");
            //1.静态内部类不能直接访问外部类的实例成员，只能访问外部类的静态成员
            System.out.println(NAME);
            //System.out.println(age);//报错
        }
    }
}
