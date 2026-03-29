package com.gdut.polymorphsm;

public class Test {
    public static void main(String[] args) {
        //对象多态，行为多态
        Hero h1 = new DoubleC();
        h1.live();//方法：编译看左边，运行看右边
        System.out.println(h1.name);//成员变量：编译看左边，运行也看左边

        System.out.println("------------------");
        //h1.zuoLao();多态下不能调用子类独有功能
        DoubleC d1 = (DoubleC) h1;
        d1.zuoLao();


        var h2 = new FuZhu();
        h2.live();//方法：编译看左边，运行看右边
        System.out.println(h2.name);//成员变量：编译看左边，运行也看左边
        h2.baoRen();



        //父类类型作为参数可以接收一切子类子类对象
        DoubleC h3 = new DoubleC();
        go(h3);

        FuZhu h4 = new FuZhu();
        go(h4);
    }


    public static void go(Hero h){
        System.out.println("===========================");
        System.out.println("全军出击");
        h.live();
        //java建议强制类型转换前先确定对象的真实类型，再进行强制类型转换
        if(h instanceof DoubleC){
            DoubleC h1 = (DoubleC) h;
            h1.zuoLao();
        }else{
            FuZhu h1 = (FuZhu) h;
            h1.baoRen();
        }
    }
}
