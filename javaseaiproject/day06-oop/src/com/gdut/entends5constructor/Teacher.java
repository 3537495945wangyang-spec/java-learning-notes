package com.gdut.entends5constructor;

public class Teacher {
    private String name;
    private int age;
    private String subject;
    private String university;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", university='" + university + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher (String name,int age,String subject){
        //this调用兄弟构造器，必须写在构造器的第一行
        this(name,age,subject,"gdut");
    }


    public Teacher(String name, int age, String subject, String university) {
        super();
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.university=university;
    }
    public Teacher(){};


}







