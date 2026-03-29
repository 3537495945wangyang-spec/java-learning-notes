package com.gdut.interface3;




public class Test {
    public static void main(String[] args) {
        //接口案例
        System.out.println("吕一对王者荣耀英雄喜爱程度");
        //本案例是有两个功能分别是打印英雄基本信息。和打印平均得分
        //方案一 打印英雄信息，打印平均得分
        //方案二 打印英雄信息（加上男女占比），打印平均得分（去掉最高和最低分）
       Hero[] allHero = new Hero[10];
       allHero[0] = new Hero("西施", '女',98);
       allHero[1] = new Hero("杨玉环", '女', 99);
       allHero[2] = new Hero("甄姬", '女', 95);
       allHero[3] = new Hero("伽罗", '女', 90);
       allHero[4] = new Hero("狂铁", '男', 88);
       allHero[5] = new Hero("刘禅", '男', 80);
       allHero[6] = new Hero("阿珂", '女', 56);
       allHero[7] = new Hero("夏侯惇", '男', 40);
       allHero[8] = new Hero("项羽", '男', 33);
       allHero[9] = new Hero("澜", '男', 10);

       HeroDataInterImpl1 hdi = new HeroDataInterImpl1(allHero);
       hdi.printAllHero();
       hdi.printAverageGrade();
       System.out.println("===========================");
       HeroDataInterImpl2 hdi2 = new HeroDataInterImpl2(allHero);
       hdi2.printAllHero();
       hdi2.printAverageGrade();
    }

}
