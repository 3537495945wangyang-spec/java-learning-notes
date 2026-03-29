package com.gdut.extends1demo;
//教师类；子类
public class Teacher extends People{
    private String skill;

    public Teacher() {
        super("", ' ');
    }
    public Teacher(String name, char sex) {
        super(name, sex);
    }

    public String getSkill()
    {
        return skill;
    }
    public void setSkill(String skill)
    {

        this.skill = skill;
    }
}
