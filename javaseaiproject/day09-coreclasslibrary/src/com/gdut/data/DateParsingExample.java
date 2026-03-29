package com.gdut.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsingExample {
    public static void main(String[] args) {
        // 方法1：使用默认格式解析（ISO格式：yyyy-MM-dd）
        String dateStr1 = "2024-12-25";
        //解析格式为 LocalDate 对象 = LocalDate.parse(被解析对象)
        LocalDate date1 = LocalDate.parse(dateStr1);
        System.out.println("解析结果1: " + date1);
        
        // 方法2：使用自定义格式解析
        String dateStr2 = "2024/12/25";
        //解析格式为 DateTimeFormatter 对象 = DateTimeFormatter.ofPattern(格式字符串)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date2 = LocalDate.parse(dateStr2, formatter);
        System.out.println("解析结果2: " + date2);
        
        // 方法3：解析中文日期
        String dateStr3 = "2024年12月25日";
        //解析格式为 DateTimeFormatter 对象 = DateTimeFormatter.ofPattern(格式字符串)
        DateTimeFormatter chineseFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date3 = LocalDate.parse(dateStr3, chineseFormatter);
        System.out.println("解析结果3: " + date3);
    }
}