package com.gdut.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
    public static void main(String[] args) {
        // 获取当前日期
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        
        // 定义不同的格式化方式
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");// 小时：分：秒
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("MM月dd日 HH:mm");
        
        System.out.println("格式1: " + today.format(formatter1));
        System.out.println("格式2: " + today.format(formatter2));
        System.out.println("格式3: " + now.format(formatter3));
        System.out.println("格式4: " + now.format(formatter4));
        
        // 上午下午格式
        DateTimeFormatter amPmFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
        System.out.println("上午下午格式: " + now.format(amPmFormatter));
    }
}