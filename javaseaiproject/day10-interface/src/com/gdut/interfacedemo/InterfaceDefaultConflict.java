package com.gdut.interfacedemo;

public class InterfaceDefaultConflict {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.show();
    }

}
// 接口A
interface InterfaceA {
    default void show() {
        System.out.println("InterfaceA's show method");
    }
}

// 接口B - 与InterfaceA有相同签名的默认方法
interface InterfaceB {
    default void show() {
        System.out.println("InterfaceB's show method");
    }
}

// 创建一个接口C，继承接口A和B
interface InterfaceC extends InterfaceA, InterfaceB {
    void show();

/*    default void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
    }*/
}

//创建一个父类，也用相同签名的默认方法
class Parent {
    public void show() {
        System.out.println("Parent's show method");
    }
}

// 实现类 实现接口A和接口B 默认方法发生冲突
class MyClass extends Parent implements InterfaceA, InterfaceB {
    //1.父类级别高于接口，直接调用父类

    //2.重写show方法
        @Override
        public void show() {
            System.out.println("MyClass's show method");
        }

    //3.选择某一个接口
    /*public void show(){
      //格式 接口名.  super.方法名
        InterfaceA.super.show();//调用A接口的方法
        InterfaceB.super.show();//调用B接口的方法
    }*/
}
