package com.gdut.demo6_file;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
         File file1 = new File(".\\src\\com\\gdut\\demo_file\\Demo.java");
         File file2 = new File("..\\Demo.java");
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsoluteFile());
        //System.out.println(file1.getCanonicalFile());

        //创建新文件
        File file3 = new File("new_file.txt");
        if(!file3.exists() ){
            boolean isCreate = file3.createNewFile();
            System.out.println(isCreate ? "创建成功" : "创建失败");
        }

        //创建单级目录
        File dir1 = new File("new_dir");
        dir1.mkdir();

        //创建多级目录
        File dir2 = new File("new_dir\\new_dir2");
        dir2.mkdirs();

        //遍历目录
        File dir3 = new File("Z:\\StickingMoon\\wallpaper");
        printAllFiles(dir3);

    }

    public static void printAllFiles(File dir) {
        if (!dir.isDirectory()) { // 如果不是目录，直接打印（或处理文件）
            System.out.println(dir.getAbsolutePath());
            return;
        }

        File[] files = dir.listFiles(); // 获取目录下的所有文件和子目录的 File对象数组（更常用）
        if (files == null) return; // 目录为空或无权限访问

        for (File file : files) {
            if (file.isDirectory()/* 判断是否为目录 */) {
                printAllFiles(file); // 递归遍历子目录
            } else {
                System.out.println(file.getAbsolutePath()); // 打印文件路径
            }
        }
    }


}
