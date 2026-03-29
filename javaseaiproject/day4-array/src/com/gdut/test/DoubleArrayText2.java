package com.gdut.test;

public class DoubleArrayText2
{
    public static void main(String[]  args) {
        System.out.println("欢迎来到串月的随机座位生成系" +
                "，将为您随机生成三次后三排的作为供您选择");
        for(int i = 0;i < 3; i++){
        System.out.println("一下是第"+(i+1)+"次随机座位表");
            student();
            System.out.println();
        }
    }

    public static void student() {
        String[][] students = {
                {"null cbc", "大眼  xkx", "低血糖 考勤员", "NaCl Sqq"},//0
                {"ZM   串月", "ice mary", "谢      内阁", "淇淇  丁丁"},//1
                {"小王   澄", "吉吉  每内", "null   门神", "水良  null"}//2
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {

                int x = (int)(Math.random() * students.length);
                int y = (int)(Math.random() * students[x].length);

                String temp = students[x][y];

                students[x][y] = students[i][j];

                students[i][j] = temp;
            }

        }
        print(students);

    }

    public static void print(String[][] students)
    {
        for (int i = 0; i < students.length; i++) {
            String[] name = students[i];
            for (int j = 0; j < name.length; j++) {
                System.out.print(name[j] + "\t");
            }
            System.out.println();
        }
    }
}
