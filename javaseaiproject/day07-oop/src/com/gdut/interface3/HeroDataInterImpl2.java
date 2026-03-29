package com.gdut.interface3;

public class HeroDataInterImpl2 implements HeroDataInter {

    private Hero[] allHero;

    public HeroDataInterImpl2(Hero[] allHero) {
        this.allHero = allHero;
    }

    @Override
    public void printAllHero() {

        int man = 0;
        for (Hero hero : allHero) {
            if (hero.getSex() == '男') {
                man++;
            }
            System.out.printf("英雄：%-7s 性别：%-3c 喜爱值：%-5d \n",hero.getName(),(char)hero.getSex(),hero.getGrade());


        }
        System.out.println("男英雄个数为" + man);
        System.out.println("女英雄个数为" + (allHero.length - man));
    }

    @Override
    public void printAverageGrade() {
        Hero h1 = allHero[0];
        double max = h1.getGrade();
        double min = h1.getGrade();
        double sum = h1.getGrade();
        for (int i = 1; i < allHero.length; i++) {
            if (allHero[i].getGrade() > max) {
                max = allHero[i].getGrade();
            }
            if (allHero[i].getGrade() < min) {
                min = allHero[i].getGrade();
            }
            sum = sum + allHero[i].getGrade();
        }
        System.out.println("去掉最大值和最大值后的喜爱程度平均值为：" + (sum - max - min) / allHero.length);
    }
}
