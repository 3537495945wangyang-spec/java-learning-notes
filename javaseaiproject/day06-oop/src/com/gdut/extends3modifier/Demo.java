package com.gdut.extends3modifier;

import com.gdut.extends2modifier.Fu;

public class Demo extends Fu {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.publicMethod();
        demo.protectedMethod();
    }
    public void test()
    {//继承了父类的东西所以可以直接用父类里面定义好的方法
        //privateMethod();
        //method();
        protectedMethod();
        publicMethod();
    }
}
