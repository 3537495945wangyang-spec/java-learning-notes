package com.gdut.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {
    private String name;
    private char sex;
    private int grade;
    private int age;

    public static int compareByGrade(Hero o1, Hero o2){
        return o1.getGrade() - o2.getGrade();
    }

    public  int compareByAge(Hero o1, Hero o2){
        return o1.getAge() - o2.getAge();
    }


}


