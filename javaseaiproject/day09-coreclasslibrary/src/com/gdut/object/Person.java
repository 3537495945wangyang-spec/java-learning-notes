package com.gdut.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements  Cloneable{
    private  String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //判断对象是否相等
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;//强转,把对象转为Person对象
        return this.age == person.age && Objects.equals(this.name, person.name);
    }

    @Override
    public int hashCode() {
        //计算对象的哈希值
        return Objects.hash(name, age);
    }

    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
