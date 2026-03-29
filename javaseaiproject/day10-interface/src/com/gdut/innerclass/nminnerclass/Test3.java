package com.gdut.innerclass.nminnerclass;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        Hero[] allHero = new Hero[10];
        allHero[0] = new Hero("西施", '女',98);
        allHero[1] = new Hero("杨玉环", '女', 99);
        allHero[2] = new Hero("甄姬", '女', 95);
        allHero[3] = new Hero("伽罗", '女', 90);
        allHero[4] = new Hero("狂铁", '男', 88);
        allHero[5] = new Hero("刘禅", '男', 80);
        allHero[6] = new Hero("嫦娥", '女', 101);
        allHero[7] = new Hero("夏侯惇", '男', 40);
        allHero[8] = new Hero("项羽", '男', 33);
        allHero[9] = new Hero("澜", '男', 10);

//            参数一，申明一个数组
                           //参数二，申明一个比较器对象
        Arrays.sort(allHero, new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
           /*     //如果o1的等级比o2高，返回正数
                //如果o1的等级比o2低，返回负数
                //如果o1的等级和o2相等，返回0
                if (o1.getGrade() > o2.getGrade()) {
                    return 1;
                } else if (o1.getGrade() < o2.getGrade()){
                    return -1;
            }else
                return 0;
            }*/

                //return o1.getGrade() - o2.getGrade();//升序
                return o2.getGrade() - o1.getGrade(); //降序
            }
        });


        //遍历所有数组
        for (Hero hero : allHero) {
            System.out.printf("英雄：%-7s 性别：%-3c 喜爱值：%-5d \n",hero.getName(),(char)hero.getSex(),hero.getGrade());
        }
    }
}
