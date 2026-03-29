package com.gdyt.singleinstance;

public class B {
    //懒汉式单例类
    private static B b;

    private B(){}

    public static B getInstance(){
        if(b == null){
            //第一次创建对象
            b = new B();
        }
        return b;
    }
}
