package com.gdut.interface1;

public class Test1 {
    public static void main(String args) {
        //A a = new A();  接口不能创建对象
        C c = new C();
        c.run();
        c.show();
        c.show2();

    }
}
class C implements A,B{
// C类实现 A接口和 B接口类似于继承
    // 必须重写接口中的抽象方法
    //C称为实现类，可以同时实现多个接口
    @Override
    public void run() {

    }

    @Override
    public void show() {

    }

    @Override
    public void show2() {

    }
}
