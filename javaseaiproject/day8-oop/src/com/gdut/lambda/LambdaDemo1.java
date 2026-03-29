package com.gdut.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {

        /*Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        };*/
        //简化匿名内部类，只能是有且仅有一个抽象方法的接口
        Swim s = () -> System.out.println("学生游泳");

        s.swim();

    }
}
//函数式接口：只有一个抽象方法
@FunctionalInterface
interface Swim{
    void swim();
}
