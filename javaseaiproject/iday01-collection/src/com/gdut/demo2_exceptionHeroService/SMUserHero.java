package com.gdut.demo2_exceptionHeroService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SMUserHero {
    private String name;
    private Level level;

    @Override
    public String toString() {
        String levelName;
        //白色｜见习
        //绿色｜资深
        //蓝色｜精英
        //紫色｜宗师
        //红色｜传说
        //银色（巅峰）
        //黑色（传说）
        //彩色（神话）
        if(level.equals(Level.COLORFUL)){
            levelName = "彩标_神话";
        } else if (level.equals(Level.WHITE)) {
            levelName = "白标_见习";
        } else if (level.equals(Level.GREEN)) {
            levelName = "绿标_资深";
        } else if (level.equals(Level.BLUE)) {
            levelName = "蓝标_精英";
        }
        else if (level.equals(Level.PURPLE)) {
            levelName = "紫标_宗师";
        } else if (level.equals(Level.RED)) {
            levelName = "红标_传说";
        } else if (level.equals(Level.BLACK)) {
            levelName = "黑标_传说";
        } else {
            levelName = "银标_巅峰";
        }
        return "英雄名称：" + name + "英雄等级：" + levelName;
    }
}
