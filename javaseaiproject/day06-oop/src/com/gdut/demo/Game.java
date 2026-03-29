package com.gdut.demo;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("欢迎来到串月饭店刷卡机，本机能够接收King卡和Queen卡" + "\n"
        + "King卡用户可以享有八折优惠，消费满200元赠送二锅头一瓶" + "\n"
                + "Queen卡用户享有九折优惠，消费满200元赠送雪花啤酒一箱" + "\n");
       Customer k1 = new King("陈彦澄",1325456,43244);
       Customer q1 = new Queen("兰浪",221434674,1893);
       pay(k1);
       pay(q1);
    }

    public static void pay(Customer c){
        System.out.println("用户请刷卡,请您输入当前的消费金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        System.out.println("欢迎您" + c.getName() + "用户");
        c.consume(money);

    }
}
