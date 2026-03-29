package com.gdut.demo;

import java.util.Scanner;

public class HomeAppliTest {
    public static void main(String[] args) {
        System.out.println("欢迎来到串月的智能家居系统\n本系统用于调控家里不同电器的开关 ");
        //1、创建父类对象HomeAppli
        //2、创建子类对象
        //3.创建初始对象
        HomeApplo[] has = new HomeApplo[4];
        has[0] = new AircConditioner("华菱空调",false);
        has[1] = new WashMachine("小天鹅洗衣机",true);
        has[2] = new Television("雷鸟电视机",false);
        has[3] = new Cleaner("追觅洗地机",true);
        //4.创建一个接口来执行开关机的操作
        //5.创建一个智能家居类
        SmartHome sh = new SmartHome();
        //6.提示用户进行操作
        //打印全部设备的现状
        while(true){
        SmartHome.printAll(has);


        System.out.println("请输入要操作的设备编号，结束操作输入5： ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num) {
            case 1:
                sh.SmartHomeControl(has[0]);
                break;
            case 2:
                sh.SmartHomeControl(has[1]);
                break;
            case 3:
                sh.SmartHomeControl(has[2]);
                break;
            case 4:
                sh.SmartHomeControl(has[3]);
                break;

            case 5:
                System.out.println("感谢使用本系统！");
                return;
            default:
                System.out.println("输入错误！");
        }
        }
    }
}
