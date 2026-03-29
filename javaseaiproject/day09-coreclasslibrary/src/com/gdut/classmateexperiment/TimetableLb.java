package com.gdut.classmateexperiment;

import java.util.Locale;
import java.time.LocalDate;
import java.time.format.TextStyle;

/**
 * Timetable 类用于生成指定年份和月份的日历，并在日历中显示教学周信息。
 */
public class TimetableLb {

    /**
     * 程序入口点，调用 table 方法打印日历。
     * 首先打印 2025 年 1 月至 12 月的日历并计算周数，
     * 然后使用该周数作为起始周继续打印 2026 年 1 月的日历。
     *
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        int week = table(2025,1,9,12);
        table(2026,week,1,1);
    }

    /**
     * 打印指定年份、起始周数以及月份范围内的日历表格。
     * 每个日期会标注当前是第几周，并按星期排列。
     *
     * @param year         要打印日历的年份
     * @param iii          初始的教学周数
     * @param startMonth   开始打印的月份（含）
     * @param overMonth    结束打印的月份（含）
     * @return             返回处理完所有月份后的最终周数
     */
    public static int table(int year,int iii,int startMonth,int overMonth){
        // 循环遍历从 startMonth 到 overMonth 的每个月份
        for(var month = startMonth;month <= overMonth;month++){
            var ii = -1;
            var dates = LocalDate.of(year,month,1);
            String monthName = dates.getMonth().getDisplayName(TextStyle.FULL,Locale.getDefault());
            var daysOfMonth = dates.lengthOfMonth();

            // 输出月份标题及表头
            System.out.println(year + "年" + monthName);
            System.out.println("-----------------------------------------------------");
            System.out.printf("%6s%6s%6s%6s%6s%6s%6s%n",
                    "       一","  二","  三","  四","  五","  六","  日");

            // 计算当月第一天是星期几，并填充前面空位
            var dayOfWeek = dates.getDayOfWeek().getValue();
            for (var i = 2;i <= dayOfWeek;i++){
                System.out.printf("%7s"," ");
            }

            // 输出每一天及其对应的周数标记
            for (var i = 1;i <= daysOfMonth;i++){
                if(ii >= 0||iii >= 22){
                    System.out.printf("%7s",i);
                }else{
                    System.out.print("第");
                    System.out.print(iii);
                    System.out.print("周");
                    System.out.printf("%3s",i);
                    ii = ii / -1;
                }

                // 当一行填满七天时换行，并更新周数
                if((dayOfWeek + i - 1) % 7 == 0){
                    System.out.println();
                    if(iii >= 21){
                        System.out.print("  ");
                    }
                    ii = ii / -1;
                    iii++;
                }
            }
            System.out.printf("%n%n");
        }
        return iii;
    }
}
