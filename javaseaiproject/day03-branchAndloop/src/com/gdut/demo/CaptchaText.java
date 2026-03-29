package com.gdut.demo;

public class CaptchaText
{
        /**
     * 程序入口函数，用于演示验证码生成功能
     * 该函数会生成并打印4位和6位的验证码，验证码由数字和大小写字母组成
     * @param args 命令行参数数组
     */
    public static void main(String[] args)
    {

        // 打印程序欢迎信息和功能说明
        System.out.println("欢迎来到串月的验证码生成程序，即将为您生成四位和六位验证码 \n" +
                " 共有三种类型的组合分别是数字和大小写字母");

        // 生成并打印4位验证码
        System.out.println(getcode(4));

        // 生成并打印6位验证码
        System.out.println(getcode(6));

        // 打印字符 'A' 后面第10个字符（即字符 'K'）
        System.out.println((char)('A' + 10));
    }


        /**
     * 生成指定长度的验证码字符串
     * @param n 验证码的长度
     * @return 包含数字、大写字母和小写字母的随机验证码字符串
     */
    public static String getcode(int n)
    {
        String Captcha = "";
        // 循环生成n个字符组成验证码
        for (int i = 0; i < n ; i++) {
            int type = (int)(Math.random() * 3);//随机选择字符类型：数字0/大写1/小写2

            switch(type)
            {
                case 0:
                    // 生成0-9的随机数字
                    int num = (int)(Math.random() * 10);
                    Captcha += num;
                    break;
                case 1:
                    // 生成A-Z的随机大写字母
                    int num1 = (int)(Math.random() * 26);
                    char Ch = (char)('A' + num1);
                    Captcha += Ch;
                    break;
                case 2:
                    // 生成a-z的随机小写字母
                    int num2 = (int)(Math.random() * 26);
                    char ch = (char)('a' + num2);
                    Captcha += ch;
                    break;
            }
        }
        return Captcha;
    }

}
