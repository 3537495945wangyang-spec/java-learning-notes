package com.gdut.entends5constructor;

public class Test {
    public static void main(String[]  args){
        Teacher t1 = new Teacher("张沙清",54,
                "java程序设计","gdut");
        System.out.println(t1);

        Teacher t2 = new Teacher("张延林",49,
                "大学生职业规划");
        System.out.println(t2);
    }
}
