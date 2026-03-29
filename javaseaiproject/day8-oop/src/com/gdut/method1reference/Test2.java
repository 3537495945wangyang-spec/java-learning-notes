package com.gdut.method1reference;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        //实例方法引用
        test1();

    }
    public static void test1(){
        //用lanmda表达式简化实际例子
        Hero[] allHero = new Hero[10];
        allHero[0] = new Hero("西施", '女',98,17);
        allHero[1] = new Hero("杨玉环", '女', 99,30);
        allHero[2] = new Hero("甄姬", '女', 95,25);
        allHero[3] = new Hero("伽罗", '女', 90,21);
        allHero[4] = new Hero("狂铁", '男', 88,45);
        allHero[5] = new Hero("刘禅", '男', 80,11);
        allHero[6] = new Hero("阿珂", '女', 56,34);
        allHero[7] = new Hero("夏侯惇", '男', 40,33);
        allHero[8] = new Hero("项羽", '男', 33,45);
        allHero[9] = new Hero("澜", '男', 10,22);

        // Arrays.sort(allHero,(o1, o2) -> o1.getGrade() - o2.getGrade());

        //如果某一个lambda表达式只是引用一个静态方法且前后参数一致，
        // 可以直接用          类名：：静态方法
//        Arrays.sort(allHero, Hero::compareByGrade);

        Hero hero1 = new Hero();
//        Arrays.sort(allHero,(o1, o2) -> hero1.compareByAge(o1, o2));
        //如果某一个lambda表达式只是引用一个实例方法且前后参数一致，、
        // 可以直接用          对象名：：实例方法
        Arrays.sort(allHero,hero1::compareByAge);


        for (Hero hero : allHero) {
            System.out.printf("英雄：%-7s 性别：%-3c 喜爱值：%-5d \n",hero.getName(),(char)hero.getSex(),hero.getGrade());
        }
    }
}
