package com.gdut.demo;
//创建智能对象
public class SmartHome {

    public void SmartHomeControl(HomeApplo Ha){
        System.out.println("====================开始操作================= " );
        System.out.println(Ha.getName() + " 目前开关机状态  " +
                (Ha.isStatus() ? "关闭" : "开启"));
        Ha.press();
        System.out.println(Ha.getName() + " 操作后的开关机状态  " +
                (Ha.isStatus() ? "关闭" : "开启"));
        System.out.println("====================操作结束================= " );
    }

    public static void printAll(HomeApplo[] has) {
        for (int i = 0; i < has.length; i++) {
            System.out.println((i+1) +", 设备的名称 "+ has[i].getName()+ "   目前开关机状态  "+ (has[i].isStatus() ? "关闭" : "开启"));
        }
    }
}
