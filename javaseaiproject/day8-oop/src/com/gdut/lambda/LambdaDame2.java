package com.gdut.lambda;

import com.gdut.nminnerclass.Hero;

import javax.swing.*;
import java.util.Arrays;

public class LambdaDame2 {
    public static void main(String[] args) {


        test1();
        test2();
    }

    public static void test1(){
        //用lanmda表达式简化实际例子
        Hero[] allHero = new Hero[10];
        allHero[0] = new Hero("西施", '女',98);
        allHero[1] = new Hero("杨玉环", '女', 99);
        allHero[2] = new Hero("甄姬", '女', 95);
        allHero[3] = new Hero("伽罗", '女', 90);
        allHero[4] = new Hero("狂铁", '男', 88);
        allHero[5] = new Hero("刘禅", '男', 80);
        allHero[6] = new Hero("阿珂", '女', 56);
        allHero[7] = new Hero("夏侯惇", '男', 40);
        allHero[8] = new Hero("项羽", '男', 33);
        allHero[9] = new Hero("澜", '男', 10);



//        Arrays.sort(allHero, new Comparator<Hero>() {
//            @Override
//            public int compare(Hero o1, Hero o2) {
//                return o1.getGrade() - o2.getGrade();//升序
//            }
//        });

        //当参数类型相同时，可以省略参数类型
//        Arrays.sort(allHero,(Hero o1, Hero o2) ->{
//            return o1.getGrade() - o2.getGrade();//升序
//        });

        //参数类型可以全部省略不写
//        Arrays.sort(allHero,( o1,  o2) ->{
//            return o1.getGrade() - o2.getGrade();//升序
//        });

        //如果只有一行，大括号也可以省略，return也必须省略，必须去掉分号
        Arrays.sort(allHero,( o1,  o2) -> o1.getGrade() - o2.getGrade());



        for (Hero hero : allHero) {
            System.out.printf("英雄：%-7s 性别：%-3c 喜爱值：%-5d \n",hero.getName(),(char)hero.getSex(),hero.getGrade());
        }
    }

    public static void test2(){
        //创建一个登录窗口，只有一个登录按钮
        JFrame win = new JFrame("登录窗口");
        JButton btn = new JButton("登录");//创建登录按钮
        JPanel panel = new JPanel();

        win.add(panel);//添加面板

        win.setSize(300, 200);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出程序
        win.setLayout(null);//使用绝对布局
        win.setLocationRelativeTo(null);//居中显示

        btn.setBounds(100, 100, 100, 30);//设置按钮的位置和宽高
        win.add(btn);//添加按钮
        //并非主动去使用匿名内部类，而是使用别人的代码的时候需要使用匿名内部类


//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("登录成功");
//            }
//        });


//        btn.addActionListener((ActionEvent e)-> {
//            System.out.println("登录成功");
//        });

        //参数类型可以全部省略不写
//        btn.addActionListener(( e)-> {
//            System.out.println("登录成功");
//        });

        //如果只有一个参数，小括号也可以省略
//        btn.addActionListener( e-> {
//            System.out.println("登录成功");
//        });

        //如果只有一行，大括号也可以省略，return也必须省略，必须去掉分号
        btn.addActionListener( e-> System.out.println("登录成功"));

       // btn.addActionListener(e ->  System.out.println("登录成功"));


        win.setVisible(true);
    }
}
