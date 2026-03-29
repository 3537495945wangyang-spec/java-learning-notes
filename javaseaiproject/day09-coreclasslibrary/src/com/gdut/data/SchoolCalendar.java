package com.gdut.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SchoolCalendar {
    private LocalDate startDate;  // 学期开始日期
    private int totalWeeks;       // 总周数
    private int currentWeek = 1;  // 当前周数
    
    public SchoolCalendar(LocalDate startDate, int totalWeeks) {
        this.startDate = startDate;
        this.totalWeeks = totalWeeks;
    }
    
    /**
     * 打印指定范围的周历
     * @param startWeek 开始周数
     * @param endWeek 结束周数
     */
    public void printCalendarRange(int startWeek, int endWeek) {
        if (startWeek < 1 || endWeek > totalWeeks || startWeek > endWeek) {
            System.out.println("周数范围无效！");
            return;
        }
        
        System.out.println("=== 校历 (" + startWeek + "-" + endWeek + "周) ===");
        
        for (int week = startWeek; week <= endWeek; week++) {
            printWeekCalendar(week);
            System.out.println();
        }
    }
    
    /**
     * 打印单周日历
     * @param weekNumber 周数
     */
    private void printWeekCalendar(int weekNumber) {
        // 计算该周的开始日期（周一）
        LocalDate weekStart = startDate.plusWeeks(weekNumber - 1);
        
        System.out.println("第 " + weekNumber + " 周 (" + 
                          weekStart.format(DateTimeFormatter.ofPattern("MM月dd日")) + " - " +
                          weekStart.plusDays(6).format(DateTimeFormatter.ofPattern("MM月dd日")) + ")");
        System.out.println("┌──────┬──────┬──────┬──────┬──────┬──────┬──────┐");
        System.out.println("│  周一│  周二│  周三│  周四│  周五│  周六│  周日│");
        System.out.println("├──────┼──────┼──────┼──────┼──────┼──────┼──────┤");
        
        System.out.print("│");
        for (int i = 0; i < 7; i++) {
            LocalDate currentDate = weekStart.plusDays(i);
            System.out.printf(" %2d日 │", currentDate.getDayOfMonth());
        }
        System.out.println();
        System.out.println("└──────┴──────┴──────┴──────┴──────┴──────┴──────┘");
    }
    
    /**
     * 按月分组打印日历
     * @param startWeek 开始周数
     * @param endWeek 结束周数
     */
    public void printCalendarByMonth(int startWeek, int endWeek) {
        if (startWeek < 1 || endWeek > totalWeeks || startWeek > endWeek) {
            System.out.println("周数范围无效！");
            return;
        }
        
        System.out.println("\n=== 校历（按月分组）===");
        
        int currentMonth = 0;
        boolean newMonth = true;
        
        for (int week = startWeek; week <= endWeek; week++) {
            LocalDate weekStart = startDate.plusWeeks(week - 1);
            int month = weekStart.getMonthValue();
            
            // 如果是新的月份，打印月份标题
            if (month != currentMonth) {
                if (!newMonth) {
                    System.out.println();
                }
                System.out.println("=== " + month + "月 ===");
                currentMonth = month;
                newMonth = false;
            }
            
            printWeekCalendar(week);
        }
    }
    
    /**
     * 打印整个学期日历
     */
    public void printFullCalendar() {
        printCalendarRange(1, totalWeeks);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 设置学期信息
        LocalDate semesterStart = LocalDate.of(2024, 2, 26); // 学期开始日期
        int totalWeeks = 20; // 总周数
        
        SchoolCalendar calendar = new SchoolCalendar(semesterStart, totalWeeks);
        
        while (true) {
            System.out.println("\n=== 校历打印系统 ===");
            System.out.println("1. 打印整个学期");
            System.out.println("2. 打印指定周数范围");
            System.out.println("3. 按月分组打印");
            System.out.println("4. 退出");
            System.out.print("请选择操作: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    calendar.printFullCalendar();
                    break;
                    
                case 2:
                    System.out.print("请输入开始周数: ");
                    int startWeek = scanner.nextInt();
                    System.out.print("请输入结束周数: ");
                    int endWeek = scanner.nextInt();
                    calendar.printCalendarRange(startWeek, endWeek);
                    break;
                    
                case 3:
                    System.out.print("请输入开始周数: ");
                    startWeek = scanner.nextInt();
                    System.out.print("请输入结束周数: ");
                    endWeek = scanner.nextInt();
                    calendar.printCalendarByMonth(startWeek, endWeek);
                    break;
                    
                case 4:
                    System.out.println("再见！");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("无效选择！");
            }
        }
    }
}