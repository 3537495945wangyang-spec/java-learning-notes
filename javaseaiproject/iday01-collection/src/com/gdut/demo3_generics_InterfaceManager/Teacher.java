package com.gdut.demo3_generics_InterfaceManager;

import lombok.Data;

import java.util.Objects;

@Data
public class Teacher{
    private  String id;
    private  String name;
    private  int age;
    private char sex;
    public Teacher(){}
    public Teacher(String id, String name, int age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && sex == teacher.sex && Objects.equals(id, teacher.id) && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }


}
