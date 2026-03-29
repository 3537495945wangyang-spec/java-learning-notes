package com.gdut.demo6_file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        //定义一个目录和文件路径
        File dir = new File("Z:\\docx");
        File file = new File("Z:\\docx\\1.txt");
        //检查目录是否存在
        if(!dir.exists()){//检测目录是否存在
            boolean dirCreated = dir.mkdir();//若依旧返回false，可能原因是权限不足、父类不存在、有同名文件
            System.out.println(dirCreated?"victory":"false");
        }

        //检查文件是否存在
        if(!file.exists()){
            try {
                boolean fileCreated = file.createNewFile();
                if(fileCreated){
                    System.out.println("文件创建成功");
                    System.out.println("文件路径："+file.getAbsolutePath());
                    System.out.println("文件大小："+file.length());
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }else {
            System.out.println("文件已存在");
        }

        //删除目录和文件
        if(file.exists()){
            boolean deleted = file.delete();
            System.out.println(deleted?"删除成功":"删除失败");
        }
        if(dir.exists()){
            boolean deleted = dir.delete();
            System.out.println(deleted?"删除成功":"删除失败");
        }
    }

}
