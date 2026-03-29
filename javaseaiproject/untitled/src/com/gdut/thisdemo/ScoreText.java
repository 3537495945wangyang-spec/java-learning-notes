package com.gdut.thisdemo;

public class ScoreText {
    public static void main(String[] args) {
        System.out.println("欢迎来到串月的检测是否考上一中程序\n" +
                " 主要内容是使用了this来区分变量的名称，详情跳转Score");

        Score s1 = new Score("张铭",780);
        s1.print();
        s1.condition(796);

    }
}
