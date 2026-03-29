package com.gdut.data;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TravelTimeExample {
    public static void main(String[] args) {
        // 创建出发和到达时间
        LocalDateTime departure = LocalDateTime.of(2016, Month.JULY, 20, 19, 30);
        LocalDateTime arrive = LocalDateTime.of(2016, Month.JULY, 21, 22, 20);
        
        // 创建格式化器（注意：这里修正了PPT中的错误）
        // 正确应该是 "MMM d yyyy hh:mm a" “月 日 年 时：分：秒”
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");
        
         //格式化输出
        String departureStr = departure.format(formatter);
        String arriveStr = arrive.format(formatter);
        
        System.out.println("出发时间: " + departureStr + " (America/Los_Angeles)");
        System.out.println("到达时间: " + arriveStr + " (Asia/Shanghai)");
       // System.out.println("出发时间: " + departure + " (America/Los_Angeles)");

        // 中文版本
        DateTimeFormatter chineseFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm a");
        System.out.println("出发时间(中文): " + departure.format(chineseFormatter));
        System.out.println("到达时间(中文): " + arrive.format(chineseFormatter));
    }
}