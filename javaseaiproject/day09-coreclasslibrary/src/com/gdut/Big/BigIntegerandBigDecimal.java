package com.gdut.Big;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigIntegerandBigDecimal {
    public static void main(String[] args) {
     //BigInteger   大整数类 a
        BigInteger bi11 =  BigInteger.valueOf(123675765765456L);
        BigInteger bi = new BigInteger("123456789012345678901234567890");
        String s = "123456789012345678901234567890";
        new BigInteger(s);
        //加减乘除multiply divide add subtract
        BigInteger bi1 = bi.add(new BigInteger("123"));
        BigInteger bi2 = bi.subtract(new BigInteger("12"));


        BigInteger bi3 = bi.multiply(new BigInteger("1234"));
        BigInteger bi4 = bi.divide(new BigInteger("1234"));

        //创建两个BigDecimal对象，然后执行除法，保留20位小数，圆整模式
        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("6.0");
        BigDecimal bd3 = bd1.divide(bd2,20, RoundingMode.HALF_UP);//20位小数，圆整模式
        System.out.println(bd3);

     //BigDecimal 大小数类
      var num1 = new BigDecimal("10.4");
      var num2 = new BigDecimal("10.5");
      var num3 = new BigDecimal("-10.4");
      var num4 = new BigDecimal("-10.5");
      var num5 = new BigDecimal("10.6");
      var num6 = new BigDecimal("10.745");
        var num7 = new BigDecimal("-10.745");

      //向上取整CEILING（顶部、天花板） 向正无穷舍入
        System.out.println("=== 向上取整 CEILING ===");
        System.out.println(num1.setScale(0, RoundingMode.CEILING)); // 10.4 → 11
        System.out.println(num2.setScale(0, RoundingMode.CEILING)); // 10.5 → 11
        System.out.println(num3.setScale(0, RoundingMode.CEILING)); // -10.4 → -10
        System.out.println(num4.setScale(0, RoundingMode.CEILING)); // -10.5 → -10
        System.out.println(num5.setScale(0, RoundingMode.CEILING)); // 10.6 → 11
        System.out.println(num6.setScale(1, RoundingMode.CEILING)); // 10.745 → 10.8

        //向下取整FLOOR（底部、地板） 向负无穷舍入
        System.out.println("=== 向下取整 FLOOR ===");
        System.out.println(num1.setScale(0, RoundingMode.FLOOR));// 10.4 → 10
        System.out.println(num3.setScale(0, RoundingMode.FLOOR));// -10.4 → -11
        System.out.println(num6.setScale(0, RoundingMode.FLOOR));// 10.745 → 10

        //向0取整DOWN ，直接去掉小数部分
        System.out.println("=== 向0取整 DOWN ===");
        System.out.println(num1.setScale(0, RoundingMode.DOWN));// 10.4 → 10
        System.out.println(num3.setScale(0, RoundingMode.DOWN));// -10.4 → -10
        System.out.println(num6.setScale(1, RoundingMode.DOWN));// 10.745 → 10.7

        //远离0取整UP，正数向上取整，负数向下取整
        System.out.println("=== 远离0取整 UP ===");
        System.out.println(num1.setScale(0, RoundingMode.UP)); // 10.4 → 11
        System.out.println(num3.setScale(0, RoundingMode.UP)); // -10.4 → -11
        System.out.println(num6.setScale(1, RoundingMode.UP));// 10.745 → 10.8
        System.out.println(num7.setScale(1, RoundingMode.UP));// -10.745 → -10.8

        // 四舍五入 (HALF_UP) - 最常用的银行家舍入法
        System.out.println("=== 四舍五入 (HALF_UP) ===");
        System.out.println(num1.setScale(0, RoundingMode.HALF_UP));// 10.4 → 10
        System.out.println(num2.setScale(0, RoundingMode.HALF_UP));// 10.5 → 11
        System.out.println(num3.setScale(0, RoundingMode.HALF_UP));// -10.4 → -10
        System.out.println(num4.setScale(0, RoundingMode.HALF_UP));// -10.5 → -11
        System.out.println(num6.setScale(1, RoundingMode.HALF_UP));// 10.745 → 10.8

        //银行家舍入法 (HALF_EVEN) - 更精确的舍入
//        四舍六入五考虑，
//        五后非零就进一，
//        五后皆零看奇偶，
//        五前为偶应舍去，
//        五前为奇要进一。
        System.out.println("=== 银行家舍入法 (HALF_EVEN) ===");
// 测试正好是0.5的情况
        BigDecimal test1 = new BigDecimal("10.5");  // 前一位10是偶数
        BigDecimal test2 = new BigDecimal("11.5");  // 前一位11是奇数
        BigDecimal test3 = new BigDecimal("12.5");  // 前一位12是偶数
        BigDecimal test4 = new BigDecimal("13.501");

        System.out.println(test1.setScale(0, RoundingMode.HALF_EVEN)); // 10.5 → 10 (偶数)
        System.out.println(test2.setScale(0, RoundingMode.HALF_EVEN)); // 11.5 → 12 (奇数→向上)
        System.out.println(test3.setScale(0, RoundingMode.HALF_EVEN)); // 12.5 → 12 (偶数)
        System.out.println(test4.setScale(0, RoundingMode.HALF_EVEN));// 13.501 → 14（大于0.5，向上）

// 非0.5的情况正常四舍五入
        System.out.println(num1.setScale(0, RoundingMode.HALF_EVEN)); // 10.4 → 10
        System.out.println(num5.setScale(0, RoundingMode.HALF_EVEN)); // 10.6 → 11

        //UNNECESSARY (UNNECESSARY) - 不需要舍入，如果结果有误差，则抛出异常
        System.out.println("=== 不需要舍入 (UNNECESSARY) ===");
        try {
            System.out.println(num1.setScale(0, RoundingMode.UNNECESSARY)); // 整数不需要舍入，故会抛异常
        } catch (ArithmeticException e) {
            System.out.println("UNNECESSARY模式检测到需要舍入: " + e.getMessage());
        }
        try {
            System.out.println(num6.setScale(2, RoundingMode.UNNECESSARY)); // 两位小数不需要舍入，会抛异常
        } catch (ArithmeticException e) {
            System.out.println("UNNECESSARY模式检测到需要舍入: " + e.getMessage());
        }
    }
}
