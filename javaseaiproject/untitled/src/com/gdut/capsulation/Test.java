package com.gdut.capsulation;

public class Test {
    public static void main(String[] args) {
        //掌握封装的技巧，学会合理隐藏合理暴露
        Teacher t1 = new Teacher();
        t1.setAge(-19);
        System.out.println(t1.getAge());

    }
}
