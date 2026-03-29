package com.gdut.extends2modifier;

public class Test {
    public static void main(String[] args) {
        //认识四种权限修饰符
        var fu = new Fu();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
