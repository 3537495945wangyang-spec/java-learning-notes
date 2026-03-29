package day5;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isOnline;

    Student(){}

    Student(String name,int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isOnline = true;
    }
}
