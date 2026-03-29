package gui;

import javax.swing.*;

public class GuiDemo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("请输入你的名字");
        JOptionPane.showMessageDialog(null,"hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("请输入你的年龄"));//JOptionPane输出的是字符串
        JOptionPane.showMessageDialog(null,"you are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("请输入你的身高"));
        JOptionPane.showMessageDialog(null,"you are "+height+" cm");
    }
}
