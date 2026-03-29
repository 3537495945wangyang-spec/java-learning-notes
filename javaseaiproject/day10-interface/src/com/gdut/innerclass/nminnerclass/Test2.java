package com.gdut.innerclass.nminnerclass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
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
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录成功");
            }
        });

        btn.addActionListener(e ->  System.out.println("登录成功"));


        win.setVisible(true);
    }
}
