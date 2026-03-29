package com.gdut.enumdemo;

public class Test2 {
    public static void main(String[] args) {
        //枚举类的应用场景，信息的分类和标志
        //模拟上下左右移动图片
        //move(Constant.DOWN);//参数值不受约束
        move(Direction.LEFT);//参数值受到类的控制


    }

    public static void move(Direction direction){
        switch(direction){
            case Direction.UP :
                System.out.println("向上移动");
                break;
            case Direction.DOWN :
                System.out.println("向下移动");
                break;
            case Direction.LEFT :
                System.out.println("向左移动");
                break;
            case Direction.RIGHT :
                System.out.println("向右移动");
                break;
        }
    }
}
