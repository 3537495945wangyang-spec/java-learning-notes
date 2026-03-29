package com.gdut.demo6_file_objectstream;

import lombok.Data;

import java.io.*;

//定义一个可序列化的类
@Data
class Student implements Serializable {
    private static final long serialVersionUID = 1L;//显示指定版本号
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}

public class ObjectStreamDemo {
    public static void main(String[] args) {
        //序列化
        try(ObjectOutputStream OOS = new ObjectOutputStream((new FileOutputStream("output.txt")))){
             Student student = new Student("张三", 18);
             OOS.writeObject(student);
            System.out.println("序列化成功");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //反序列化
        try(ObjectInputStream ois = new ObjectInputStream((new FileInputStream("output.txt")))){
            Student student2 = (Student)ois.readObject();
            System.out.println(student2);
        }catch (IOException |ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
