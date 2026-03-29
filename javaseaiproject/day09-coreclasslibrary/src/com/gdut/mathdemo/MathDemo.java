package com.gdut.mathdemo;

public class MathDemo {
    //数学类
    public static void main(String[] args) {
        System.out.println(Math.abs(-5));//绝对值
        //取值
        System.out.println(Math.ceil(5.1));//向上取整
        System.out.println(Math.floor(5.1));//向下取整
        System.out.println(Math.rint(5.1));//返回与x最接近的整数
        System.out.println(Math.round(5.1));//四舍五入
        System.out.println(Math.signum(-5));//返回正数、0或负数
        //计算
        System.out.println(Math.exp(5));//e的5次方
        System.out.println(Math.log(5));//ln(5)
        System.out.println(Math.sqrt(5));//平方根
        System.out.println(Math.pow(2, 3));//2的3次方


        System.out.println(Math.max(5, 10));//返回两个数中的较大值
        System.out.println(Math.min(5, 10));//返回两个数中的较小值
        System.out.println(Math.random());//返回0-1的随机数
        //s三角函数
        System.out.println(Math.asin(0.5));//返回正弦值
        System.out.println(Math.acos(0.5));//返回余弦值
        System.out.println(Math.atan(0.5));//返回正切值
        // ===== ：常数常量 =====
        System.out.println("\n=== 常数常量 ===");
        System.out.println("π = " + Math.PI);           // 圆周率 π ≈ 3.141592653589793
        System.out.println("自然常数e = " + Math.E);     // 自然对数的底 e ≈ 2.718281828459045

        //随机数
        //1.生成0-9的随机数
        System.out.println((int)(Math.random() * 10));
        //2.生成50-100的随机数
        System.out.println((int)(Math.random() * 50 + 50));
        //3.生成a到b的随机数     Math.random() * (两个数的差值加一) + 起始数字
        //（int）作用是将浮点数转换为整数
        //System.out.println((int)(Math.random() * (b - a + 1) + a));
    }
}
