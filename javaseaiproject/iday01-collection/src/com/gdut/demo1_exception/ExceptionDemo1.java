package com.gdut.demo1_exception;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExceptionDemo1 {
    public static void main(String[] args) /*throws ParseException*/{
        //认识异常（异常出现时，程序结束）
        //抛出异常的时候只会看到一种错误信息然后马上停止运行
        show();
        try {
            show1();
        } catch (ParseException e) {
//           e.printStackTrace();//这个方法会打印出完整的堆栈跟踪信息，告诉我们异常是在哪里抛出的（哪个文件的哪一行
            System.err.println("异常信息：" + e.getMessage());
            System.err.println("异常信息：" + e.toString());

        } catch (ClassNotFoundException e) {
            System.err.println("异常信息：" + e.getMessage());
            System.err.println("异常信息：" + e.toString());
            //toString()：返回异常的完整类+ 冒号 + getMessage()的内容。
//            e.printStackTrace();
        }
    }


//    写一个运行时异常的例子   水平不行，写错了
//    1.人祸   运行时异常 RuntimeException
//    程序员编译时发生的异常，编译器不报错
//    建议修复代码，而非盲目捕获 程序逻辑错误/Bug（如空指针、数组越界）

    public static void show() {
        int[] arr = {10, 20, 30};
//      System.out.println(arr[3]); //数组越界异常 ArrayIndexOutOfBoundsException

//      System.out.println(10/0); //算术异常 ArithmeticException

        //创建一个空指针异常
        String str = null;
        System.out.println(str);
//      System.out.println(str.charAt(0)); //空指针异常 NullPointerException
    }

    //写一个编译时异常        担心出错
//     2.外部不可抗因素   编译时异常 Exception(非 RuntimeException)
//     提醒程序员代码很容易出现异常，否则编译不通过
//     必须 try-catch或 throws  可预见的外部问题（如文件IO错误）

    public static void show1() throws ParseException, ClassNotFoundException {
        String str = "2007-07-04 11:12:23";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try{
            LocalDateTime Date = LocalDateTime.parse(str,formatter);
            System.out.println(Date);
    } catch (DateTimeParseException e) {
            throw  new ParseException("时间格式错误",0);
        }
        //创建一个找不到图片的异常
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            throw new ClassNotFoundException("找不到指定类");
        }
       // Class.forName("com.mysql.jdbc.Driver"); //找不到指定类异常 ClassNotFoundException

    }
}
