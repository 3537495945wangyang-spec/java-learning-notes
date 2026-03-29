package com.gdut.demo2_exceptionHeroService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws HeronameAlreadyExistsException, InvalidLevelFormatException {
        HeroService service = new HeroService();
//        service.display();
        System.out.println("欢迎来到串月的王者荣耀英雄熟练度记录程序");
        System.out.println("本赛季有的熟练度包括   白色｜见习\t" +
                " 绿色｜资深\t" +
                " 蓝色｜精英\t" +
                " 紫色｜宗师\t" +
                " 红色｜传说\t" +
                " 银色（巅峰）\t" +
                " 黑色（传说）\t" +
                " 彩色（神话）");
        System.out.println("=================================================");
        //载入一个Scanner
        Scanner sc = new Scanner(System.in);
        while (true) {
            //1。用户输入英雄的名字还有熟练度
            System.out.println("是否载入新英雄\n(Y or N)");
            String input = sc.next();
            if (input.equals("N")) {
                System.out.println("========欢迎下次再来========");
                break;
            } else if (input.equals("Y")) {
                System.out.println("=========开始录入新英雄==========");
            }else{
                System.out.println("输入错误，请重新输入");
                continue;
            }
            System.out.println("请输入英雄名字:");
            String HeroName = sc.next();
            System.out.println("请输入英雄熟练度（COLORFUL,BLACK,SILVER,RED,PURPLE,BLUE,GREEN, WHITE）");
            Level HeroLevel ;
            try {
                 HeroLevel = Level.valueOf(sc.next());
            } catch (IllegalArgumentException e) {
                System.err.println("英雄等级格式不正确");
                continue;
            }

            //2.将用户输入的英雄信息传递给service
            try {
                service.registerHero(HeroName, HeroLevel);
            } catch (HeronameAlreadyExistsException e) {
                System.err.println(e.getMessage());
                continue;
               // e.printStackTrace();
            } //3.显示所有英雄信息
            service.display();
        }
    }
}
