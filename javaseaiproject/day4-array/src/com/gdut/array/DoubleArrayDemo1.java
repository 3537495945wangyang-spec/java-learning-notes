package com.gdut.array;

public class DoubleArrayDemo1
{
    public static void main(String[] arge)
    {
        //student();
        student2();
    }
    public static void student() {
        String[][] students = {
                {"null cbc", "大眼  xkx", "低血糖 考勤员", "NaCl Sqq"},//0
                {"ZM   串月", "ice mary", "谢      内阁", "淇淇  丁丁"},//1
                {"小王   澄", "吉吉  每内", "null   门神", "水良  null"}//2
        };
        //访问其中一行数组，单独拿出来打印

        String[] name = students[1];
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }

    public static void student2() {
        String[][] students = {
                {"null cbc", "大眼  xkx", "低血糖 考勤员", "NaCl Sqq"},//0
                {"ZM   串月", "ice mary", "谢      内阁", "淇淇  丁丁"},//1
                {"小王   澄", "吉吉  每内", "null   门神", "水良  null"}//2
        };


        for (int i = 0; i < students.length; i++) {
            String[] name = students[i];
            for (int j = 0; j < name.length; j++) {
                System.out.print(name[j] + "\t");

            }
            System.out.println();
        }
    }

}
