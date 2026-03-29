package com.gdut.gui;

import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        //快速入门GUI Swing 编程
        //生成一个页面，一个登录按钮
        JFrame win = new JFrame("登录窗口");
        win.setSize(500,400);
        JButton btn = new JButton("登录");
        JPanel panel = new JPanel();
        panel.add(btn);
        win.add(panel);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出程序
        win.pack();//显示
        win.setVisible(true);//
        win.setLocationRelativeTo(null);//居中
        win.setResizable(false);//禁止缩放
        win.setAlwaysOnTop(true);//置顶

    }

}
