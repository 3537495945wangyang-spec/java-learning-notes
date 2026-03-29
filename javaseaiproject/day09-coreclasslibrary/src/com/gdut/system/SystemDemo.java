package com.gdut.system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("=== 基础属性获取 ===");
        System.out.println("操作系统: " + System.getProperty("os.name"));
        System.err.println("用户名: " + System.getProperty("user.name"));


        System.out.println("=== 数组的复制 ===");
        int[] arr = {1, 2, 3, 4, 5};
        int[] copy = new int[5];
        System.arraycopy(arr,0,copy,0,arr.length);
        System.out.println("复制后的数组：" + Arrays.toString(copy));
        //exit退出程序
//        System.exit(0);//正常推出程序
//        System.exit(1);//非正常退出程序

        //获取当前时间
        System.out.println("当前时间毫秒: " + System.currentTimeMillis());
        System.out.println("当前时间纳秒: " + System.nanoTime());

        // System.out - 标准输出
        System.out.print("普通打印 ");
        System.out.println("换行打印");
        System.out.printf("格式化打印: %s, %d, %.2f%n", "字符串", 123, 45.67);

        //可以被程序使用的属性值
        System.out.println(System.getenv("JAVA_HOME"));//获取环境变量JAVA_HOME的值
        System.out.println(System.getenv("Path"));//获取环境变量Path的值
        System.out.println(System.getenv());//获取所有的环境变量
        System.out.println(System.getenv("USERNAME"));//获取环境变量USERNAME的值
        System.out.println(System.getenv("USERPROFILE"));//获取环境变量USERPROFILE的值

    }
}
