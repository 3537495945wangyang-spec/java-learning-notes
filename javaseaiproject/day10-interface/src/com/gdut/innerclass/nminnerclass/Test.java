package com.gdut.innerclass.nminnerclass;

public class Test {
    public static void main(String[] args) {
        //匿名内部类，本质上是一个子类对象
        //匿名内部类其实是有名字的，外部类名$编号.class
        Animal a = new Animal(){
            //创建了一个子类对象，重写抽象方法
            @Override
            public void eat() {
                System.out.println("吃吃吃");
            }

        };
        a.eat();


        show(new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生游泳很快");
            }
        });
    }
    public static void show(Swim s){
        s.swimming();
    }

    }





interface Swim{
    void swimming();
}
