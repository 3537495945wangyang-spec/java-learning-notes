package com.gdut.interface4;

public interface A {
    /*1.默认方法，必须加default修饰
    默认会用public修饰
    如何调用？使用接口类实现类对象调用*/
    default void print(){
        System.out.println("A");
        print2();
    }

    /*2.私有方法
    如何调用？使用接口中其他方法调用*/
    private void print2(){
        System.out.println("A");
    }

    /*3.静态方法
    只能用接口类名调用*/
    static void print3(){
        System.out.println("A");
    }

}
