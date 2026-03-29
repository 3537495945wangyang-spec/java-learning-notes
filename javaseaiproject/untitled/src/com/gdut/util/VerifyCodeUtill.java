package com.gdut.util;

public class VerifyCodeUtill {
    //将工具类的构造器私有化，使其无法创建构造对象
    private VerifyCodeUtill() {}
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
