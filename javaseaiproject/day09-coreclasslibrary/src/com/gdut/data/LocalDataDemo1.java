package com.gdut.data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalDataDemo1 {
    public static void main(String[] args) {
        //LocalDate
        // 目标：学习常用的日期和时间API
        //获取默认时区的系统时间
        var today = LocalDate.now();
        System.out.println(today);
        //获取指定日期
        var birthday = LocalDate.of(2007, 7, 4);
        //获取指定日期之后的日期，增加多少年、月、日
        var newBirthday = birthday.plusYears(19);
        System.out.println(newBirthday);
        //每年的程序员日
        var programmerDay = LocalDate.of(2025, 1, 1).plusDays(255);
        System.out.println(programmerDay);
        //获取日期中星期的方法
        var dofw = birthday.getDayOfWeek();
        System.out.println(dofw);


        System.out.println("=================================================");
        //LocalTime
        var now = LocalTime.now();
        //获取当前时间
        System.out.println(now);
        //获取当前时间，不保留纳秒
        System.out.println(now.truncatedTo(ChronoUnit.HOURS));
        //学习ZoneId方法
        var time = LocalTime.now();
        ZoneId zoneId = ZoneId.of("Greenwich");//获取格林威治时间
        var zonedTime = LocalTime.now(zoneId);//获取指定时区的时间
        System.out.println("北京时间：" + time.truncatedTo(ChronoUnit.HOURS));
        System.out.println("格林威治时间：" + zonedTime.truncatedTo(ChronoUnit.HOURS));
    }
}
