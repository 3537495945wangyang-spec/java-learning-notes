package com.gdut.demo1_exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        // throw去扔东西（异常），然后用 try-catch去接住并处理你扔的东西。

        //正常调用
        System.out.println("95分的等级为" + calculateGradeStrict(95));

        //异常调用
        try{
            System.out.println("-5分的等级为" + calculateGradeStrict(-5));

        }catch (IllegalArgumentException e){
            System.err.println("异常信息：" + e.getMessage());
            //检测到这里抛出了一个一样的异常后，会自动把calculateGradeStrict方法中生成的异常对象“赋值”给e
        }

        try{
            System.out.println("101分的等级为" + calculateGradeStrict(101));
        }catch (IllegalArgumentException e){
            System.err.println("异常信息：" + e.getMessage());
            //返回我们在创建异常对象时传入的那段字符串，即 "分数不能为负数: -5"
            e.printStackTrace();
            //打印出完整的堆栈跟踪信息，告诉我们异常是在哪里抛出的（哪个文件的哪一行）
        }


    }

    public static char calculateGradeStrict(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("score不能小于0");
            //这里相当于创建了一个异常对象，并且抛出，里面包含错误代码的行数和文件，还有你给的信息
        } else if (score > 100) {
            throw new IllegalArgumentException("score不能大于100");
        } else if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 60) {
            return 'D';
        } else {
            return 'E';
        }

    }
}




