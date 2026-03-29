package com.gdut.demo;

import java.util.Scanner;

public class MovieOperator {

    private University[] uni;//先声明一个数组
    //构造一个含参构造器
    public MovieOperator(University[] uni) {
        this.uni = uni;
    }

    public void printAlluni() {
        for (int i = 0; i < uni.length; i++) {
            University m = uni[i];
            System.out.println(m.getId()+"\t" + m.getName() + "\t"+m.getScore() + "\t" + m.getRate());

        }
    }

    public void searchuniByid() {
        System.out.println("请输入要查询的大学编号");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 1; i < uni.length; i++) {
            University m = uni[i];
                System.out.println(m.getId()+"\t" + m.getName() + "\t"+m.getScore() + "\t" + m.getRate());
                return;
            }

        }

    }

