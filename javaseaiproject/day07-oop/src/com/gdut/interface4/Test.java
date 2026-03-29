package com.gdut.interface4;

public class Test {
    public static void main(String[] args) {
        //认识接口的三种新增方法
        Aimpl a = new Aimpl();
        a.print();
        A.print3();
    }
}



class Aimpl implements A {

}