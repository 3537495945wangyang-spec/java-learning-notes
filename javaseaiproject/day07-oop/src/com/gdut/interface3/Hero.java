package com.gdut.interface3;


public class Hero {
    private String name;
    private char sex;
    private int grade;
    public Hero() {}
    public Hero(String name, char sex, int grade) {
        this.name = name;
        this.sex = sex;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
