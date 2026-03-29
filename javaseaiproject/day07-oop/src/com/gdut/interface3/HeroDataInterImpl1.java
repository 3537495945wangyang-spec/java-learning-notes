package com.gdut.interface3;

public class HeroDataInterImpl1 implements HeroDataInter{

    private Hero[] allHero;
    public HeroDataInterImpl1(Hero[] allHero) {
        this.allHero = allHero;
    }

    @Override
    public void printAllHero() {
        for(Hero hero : allHero){
            System.out.printf("英雄：%-7s 性别：%-3c 喜爱值：%-5d \n",
                    hero.getName(),(char)hero.getSex(),hero.getGrade());
        }

    }

    @Override
    public void printAverageGrade() {
        Hero h1 = allHero[0];
        double sum = h1.getGrade();
        for (int i = 1; i < allHero.length ; i++) {
            sum = sum + allHero[i].getGrade();

        }
        System.out.println("吕一对这十个英雄的喜爱程度平均值为：" + sum/allHero.length);
    }
}
