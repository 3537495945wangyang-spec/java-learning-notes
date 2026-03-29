package com.gdut.thisdemo;
//        欢迎来到串月的检测是否考上一中程序\n" +
// 主要内容是使用了this来区分变量的名称，详情跳转ScoreText");
public class Score {
    String name;
    double score;

    public Score(String name,double score)
    {
        this.name=name;
        this.score=score;
    }

    public void print()
    {
        System.out.println("该同学的总成绩为" + score);
    }
    public void condition(double score)
    {
        if(this.score>score)
        {
            System.out.println("恭喜你考上汕头一中");
        }else
        {
            System.out.println("很遗憾，你没有考上汕头一中");
        }
    }

}
