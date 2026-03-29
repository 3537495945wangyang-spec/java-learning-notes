package com.gdut.demo3_generics_InterfaceManager;

import java.util.ArrayList;
import java.util.List;

public class StudentManager implements DataManager<Student> {
    // 用ArrayList来存储学生，就像用一个盒子装学生卡片
    //[接口/类名]<[类型参数]> [变量名] = new [实现类名/具体类名]<>();
    private List<Student> studentsList = new ArrayList<>();
    @Override
    public void add(Student student) {
        studentsList.add(student);
        System.out.println("✅ 添加了学生: " + student.getName());
    }

    @Override
    public void remove(Student student) {
        studentsList.remove(student);
        System.out.println("❌ 删除了学生: " + student.getName());
    }

    @Override
    public void update(Student student) {
        int index = studentsList.indexOf(student);//获取索引
        //若索引为-1，则说明该学生不存在
        if (index != -1) {
            studentsList.set(index, student);
            System.out.println("✅ 更新了学生: " + student.getName());
        } else {
            System.out.println("⚠️ 未找到要更新的学生: " + student.getName());
        }
    }

    @Override
    public Student find(String id) {
        for (Student s : studentsList) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void print() {
        System.out.println("=====打印所有学生信息=========");
        for (Student s : studentsList) {
            System.out.println(s);
        }

    }
}

class TeacherManager implements DataManager<Teacher> {
    private List<Teacher> teachersList = new ArrayList<>();
    @Override
    public void add(Teacher teacher) {
        teachersList.add(teacher);
        System.out.println("✅ 添加了老师: " + teacher.getName());

    }

    @Override
    public void remove(Teacher teacher) {
        teachersList.remove(teacher);
        System.out.println("❌ 删除了老师: " + teacher.getName());

    }

    @Override
    public void update(Teacher teacher) {
       int index = teachersList.indexOf(teacher);
       if (index != -1) {
           teachersList.set(index, teacher);
       System.out.println("✅ 更新了学生: " + teacher.getName());
    } else {
        System.out.println("⚠️ 未找到要更新的老师: " + teacher.getName());
    }
    }

    @Override
    public Teacher find(String id) {
        for (Teacher t : teachersList) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public void print() {
        System.out.println("=====打印所有老师信息=========");
        for (Teacher t : teachersList) {
            System.out.println(t);
        }

    }
}

