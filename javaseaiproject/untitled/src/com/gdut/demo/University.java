package com.gdut.demo;

public class University {
    private int id;
    private String name;
    private double score;
    private String student;


    public University() {}
    //定义一个有参构造器
    public University(int id,String name,double score,String student)
    {
        this.id=id;
        this.name=name;
        this.score=score;
        this.student=student;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRate() {
        return student;
    }

    public void setRate(String student) {
        this.student = student;
    }
}
