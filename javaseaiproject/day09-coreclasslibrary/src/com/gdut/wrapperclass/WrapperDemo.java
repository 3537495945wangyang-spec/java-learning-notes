package com.gdut.wrapperclass;

public class WrapperDemo {
    public static void main(String[] args) {
    //八个基本数据类型的包装类：Byte,Short,（Int）Integer,Long,Float,Double,（Char）Character,Boolean
        //调用character的valueOff方法
        Character c = 'a';
        Character c1 = 'b';
        char c2 = '串';
        System.out.println(c.compareTo('D'));
        //character的常用方法
        System.out.println(Character.isDigit('a'));//判断是否是数字
        System.out.println(Character.isLetter('a'));//判断是否是字母
        System.out.println(Character.isLetterOrDigit('a'));//判断是否是数字或字母
        System.out.println(Character.isUpperCase('a'));//判断是否是大写
        System.out.println(Character.isLowerCase('a'));//判断是否是小写
        System.out.println(Character.toUpperCase('a'));//将小写转换为大写
        System.out.println(Character.toLowerCase('A'));//将大写转换为小写
        System.out.println(Character.isWhitespace('a'));//判断是否是空白
        System.out.println(Character.isSpaceChar('a'));//判断是否是空白

        //如何将数据转换为包装类
        //Integer i = Integer.valueOf(10);//将int类型的数据转换为Integer包装类
        //Integer i = 10;//将int类型的数据转换为Integer包装类
        int i = 10;//将int类型的数据转换为Integer包装类


        Integer i1 = Integer.valueOf("10");//将字符串转换为Integer包装类

        //如何将包装类转换为数据
        int i2 = (int) i1;//将Integer包装类转换为int类型数据
        int i3 = i1.intValue();//将Integer包装类转换为int类型数据

        //Integer的常用方法
        System.out.println(Integer.toBinaryString(10));//将十进制数转换为二进制数
        System.out.println(Integer.toOctalString(10));//将十进制数转换为八进制数
        System.out.println(Integer.toHexString(10));//将十进制数转换为十六进制数
        System.out.println(Integer.parseInt("1010",2));//将二进制数转换为十进制数
        System.out.println(Integer.parseInt("10",8));//将八进制数转换为十进制数

        //SIZE BYTES MAX_VALUE(表示该类基本数据取值的最大值) MIN_VALUE
        // POSITIVE_INFINITY NEGATIVE_INFINITY NAN(not a number)都是常量
        var a = 5.0/0.0;
        System.out.println(a);//输出Infinity
        System.out.println(Integer.MAX_VALUE);//输出2147483647

        //parse的用法
        System.out.println(Integer.parseInt("10"));//字符串转数字
        System.out.println(Integer.parseInt("10",2));//二进制转数字
        System.out.println(Boolean.parseBoolean("true"));//字符串转布尔值
    }
}
