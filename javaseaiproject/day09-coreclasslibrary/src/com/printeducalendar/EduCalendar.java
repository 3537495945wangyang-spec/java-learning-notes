package com.printeducalendar;
import java.time.DayOfWeek;
import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.TextStyle;

/**
 * 教育日历打印程序
 * 根据用户输入的年份、学期类型（秋季或春季）和总周数，生成并打印对应的教育日历。
 * 支持自动调整起始日期以确保每周从周一開始，并按周显示日历。
 */
public class EduCalendar {

    /**
     * 主函数：启动教育日历生成器
     *
     * 功能描述：
     * 1. 提示用户输入年份、学期类型（Fall 或 Spring）、以及教学周总数；
     * 2. 对于春季学期，额外要求输入具体开始日期；
     * 3. 自动处理每月第一天不是周一的情况，进行偏移调整；
     * 4. 按照“星期”为单位逐行输出日历内容；
     * 5. 当达到指定的教学周数量时停止输出。
     *
     * 输入格式说明：
     * - 第一行输入："年份 学期 周数" （用空格或逗号分隔）
     * - 若为春季学期，还需第二行输入："MM.DD" 表示开学日期
     *
     * 输出格式说明：
     * - 显示每个月的日历表格，每七天换行一次；
     * - 每个新周前标注 "Week X"；
     * - 日历头部包含月份名称与星期标题栏。
     */
    public static void main(String[] args) {
        // 初始化变量
        int months = 0;             // 起始月份
        int days = 0;               // 起始日期（仅用于春季学期）
        int countWeek = 1;          // 当前是第几周

        // 创建Scanner对象读取控制台输入
        var input = new Scanner(System.in);

        // 提示用户输入基本信息
        System.out.println("""
                Please enter the year, semester(Fall or Spring) and total weeks(Split with space or ",")
                """);

        // 获取并解析第一行输入数据
        var data = input.nextLine();
        String[] temp = data.split("[,\s]+");   // 使用正则表达式分割空格或逗号
        int year = Integer.parseInt(temp[0]);   // 年份
        String semester = temp[1];              // 学期类型
        int weeks = Integer.parseInt(temp[2]);  // 总共多少周

        // 判断学期类型并设置初始月份
        switch (semester) {
            case "Fall":
                months = 9;                     // 秋季学期默认从9月开始
                break;
            case "Spring":
                // 春季学期需要手动输入起始日期
                System.out.println("Please enter the date that Spring semester starts(Format: MM.DD):");
                var moreData = input.nextLine();
                months = Integer.parseInt(moreData.substring(0, 2));  // 解析月份
                days = Integer.parseInt(moreData.substring(3, 5));    // 解析日期
                break;
        }

        // 控制是否已经完成过特殊调整标志位
        boolean adjustedSep = false;  // 是否已调整秋季学期起始日
        boolean adjustedIni = false;  // 是否已初始化春季学期起始日

        // 循环直到达到设定的周数上限
        while(countWeek <= weeks) {

            // 构造当前月份的第一天作为基准日期
            var dates = LocalDate.of(year, months, 1);
            LocalDate datesNot1st = LocalDate.of(year, months, 1);  // 备份原始日期

            // 特殊处理春季学期的自定义起始日期
            if (semester.equals("Spring") && !adjustedIni) {
                dates = LocalDate.of(year, months, days);
                adjustedIni = true;
            }

            // 特殊处理秋季学期起始日必须为周一的问题
            if(months == 9 && !adjustedSep) {
                if (!(dates.getDayOfWeek() == DayOfWeek.MONDAY)) {
                    // 向前回溯到最近的一个周一
                    while (dates.getDayOfWeek() != DayOfWeek.MONDAY) {
                        dates = dates.minusDays(1);
                        datesNot1st = LocalDate.of(dates.getYear(), dates.getMonth(), 1);
                    }
                    months--;  // 回退一个月以便正确显示上个月末尾几天
                }
                adjustedSep = true;
            }

            // 获取当前月份英文全称
            String monthName = dates.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

            // 获取该月总天数
            var dayOfMonth = dates.lengthOfMonth();

            // 打印月份标题及表头
            System.out.println(year + "    " + monthName);
            System.out.println("-------------------------------------------------");
            System.out.printf("%12s%5s%5s%5s%5s%5s%5s%n", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");

            // 计算当月第一天是一周中的第几天（周一=1,...,周日=7）
            var dayOfWeek = dates.getDayOfWeek().getValue();

            // 开始打印本周内容
            System.out.print("Week "+ countWeek);

            // 在第一个有效数字之前填充空白位置
            for (var i = 2; i <= dayOfWeek; i++) {
                System.out.printf("%5s", " ");
            }

            // 分两种情况分别处理：起始日期不是1号 和 是1号的情形
            if (dates.getDayOfMonth() != 1) {
                // 非月初起始的情况（如春季学期自定义起始日）
                dayOfWeek = datesNot1st.getDayOfWeek().getValue();
                for (var i = dates.getDayOfMonth(); i <= dayOfMonth; i++) {
                    System.out.printf("%5d", i);
                    // 判断是否到达一周结束点
                    if ((dayOfWeek + i - 1) % 7 == 0 && i != dayOfMonth) {
                        System.out.println();
                        countWeek++;
                        if (countWeek > weeks) {
                            break;
                        }
                        System.out.print("Week "+ countWeek);
                    } else if ((dayOfWeek + i - 1) % 7 == 0 && i == dayOfMonth) {
                        countWeek++;
                    }
                }
            } else {
                // 正常月初起始的情况
                for (var i = 1; i <= dayOfMonth; i++) {
                    System.out.printf("%5d", i);
                    // 判断是否到达一周结束点
                    if ((dayOfWeek + i - 1) % 7 == 0 && i != dayOfMonth) {
                        System.out.println();
                        countWeek++;
                        if (countWeek > weeks) {
                            break;
                        }
                        System.out.print("Week " + countWeek);
                    } else if ((dayOfWeek + i - 1) % 7 == 0 && i == dayOfMonth) {
                        countWeek++;
                    }
                }
            }

            // 结束本页日历后换两行继续下一个月
            System.out.printf("%n%n");

            // 更新月份和年份
            months++;
            if (months > 12) {
                months = 1;
                year++;
            }

            // 如果已达最大周数则退出循环
            if (countWeek > weeks) {
                break;
            }
        }

        // 关闭Scanner资源
        input.close();
    }
}
