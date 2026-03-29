package com.gdut.demo2_exceptionHeroService;

import java.util.ArrayList;
import java.util.List;

public class HeroService {
    //创建一个列表储存对象
    private  List<SMUserHero> registeredUsers = new ArrayList<>();
    public void registerHero(String HeroName, Level level) throws HeronameAlreadyExistsException, InvalidLevelFormatException {
        //1.英雄名称不能为空
        if (HeroName == null || HeroName.length() == 0){
            throw new HeronameAlreadyExistsException("英雄名称不能为空");
        }
        //2.英雄名称不能重复
        for (SMUserHero hero : registeredUsers) {
            if (hero.getName().equals(HeroName)) {
                throw new HeronameAlreadyExistsException("英雄名称不能重复");
            }
        }
        //3.英雄等级不能为空
        if (level == null){
            throw new InvalidLevelFormatException("英雄等级不能为空");
        }
//        //4.英雄等级必须在Level 枚举中
//        if (level != Level.RED && level != Level.SILVER && level != Level.PURPLE &&
//                level != Level.BLUE && level != Level.GREEN && level != Level.WITHE&&
//                level != Level.BLACK&&level != Level.COLORFUL) {
//            throw new InvalidLevelFormatException("英雄等级格式不正确");
//        }

        //将新英雄添加到列表中
        registeredUsers.add(new SMUserHero(HeroName, level));


    }
    public void display(){
        System.out.println(" ");
        System.out.println("=========英雄列表==========");
        if(registeredUsers.size() == 0){
            System.out.println("暂无数据");
        }else{
            for (SMUserHero hero : registeredUsers) {
                System.out.println(hero);
            }
        }
    }
}
