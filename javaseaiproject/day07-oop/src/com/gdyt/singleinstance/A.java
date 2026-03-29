package com.gdyt.singleinstance;

public class A {
    //2.定义一个静态变量作为唯一对象
    //public static final A a = new A();
    private static A a = new A();
    public static int a1 = 20;

    //1.将构造方法私有化，满足只有一个的单例设计
    private A(){}
    //3.定义一个静态方法，返回唯一对象
    public static A getInstance(){
        return a;
    }
}
