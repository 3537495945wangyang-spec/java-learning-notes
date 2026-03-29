package com.gdut.interfacedemo;

public class InterfaceDemo1 {
    public static void main (String[] args) {
        //接口可以实现多重继承
        //接口不能new一个实例对象
        int maxSpeed = InterfaceName.MAX_SPEED;//接口定义的常量可以直接调用（已经过时）

        //创建一个实现类的实例
        Demo demo = new Demo();

        //调用接口里面的静态方法
       // demo.staticshow(); 报错
        InterfaceName.staticshow();

        //调用默认方法（在默认方法里面可以调用接口的初始化方法）
        demo.defaultshow2();

        //私有/初始化方法无法直接调用
        //demo.init();报错
        //InterfaceName.init();报错
}

//声明接口的格式
//接口的名字一般用able结尾，作为一种能力例如 comparable flyable runnable
 interface InterfaceName{
    //定义一个抽象方法，可以省去public 和 abstract
    void fly();
    //定义一个常量，自动加上public static final(推荐使用枚举类enum来实现)
    int MAX_SPEED = 200;

    //定义一个静态方法
    static void staticshow(){
        System.out.println("I can staticshow static");
    }

    //定义一个默认方法（缺省）
    default void defaultshow2(){
        System.out.println("I can defaultshow2 默认");
        //调用初始化方法
        init2();
        init();
    }

    //定义一个私有的静态方法
    private static void init2(){
        System.out.println("I can init2 初始化");
    }

    //定义一个私有方法
    private void init(){
        System.out.println("I can init 一般用于创建数据库的连接，");
    }
}

abstract class AbstractClass{
    //抽象类也可以有抽象方法
    abstract void run();
}

static class Demo implements InterfaceName{
    //实现接口
    public void fly(){
        System.out.println("I can fly 重写了接口里面的抽象方法");
    }
}
}
