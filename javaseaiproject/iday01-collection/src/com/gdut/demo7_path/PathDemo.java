package com.gdut.demo7_path;

import java.io.IOException;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) throws IOException {
    var path = Paths.get("Z:\\docx\\1.txt");
    var otherPath = Paths.get("Z:\\docx\\2.txt");
    System.out.println(path.toString());//输出路径
    System.out.println(path.getFileName());//获取路径中的文件名
    System.out.println(path.getParent());//获取路径中的父目录
    System.out.println(path.getRoot());//获取路径中的根目录
    System.out.println(path.getName(0));//获取路径中的第0个元素，即根目录


        //路径的比较
        System.out.println(path.equals(otherPath));//比较两个路径是否相等
        System.out.println( Paths.get("a/b/c").startsWith("a"));//判断路径是否以指定路径开头
        System.out.println( Paths.get("a/b/c").startsWith("e"));

        System.out.println( Paths.get("a/b/c/1.txt").endsWith("1.txt"));//判断路径是否以指定路径结尾
        System.out.println( Paths.get("a/b/c/1.txt").endsWith("2.txt"));

        System.out.println("=======路径的拼接========");
        System.out.println("resolve 在路径后面拼接");
        System.out.println(Paths.get("z/c/y").resolve("1.txt"));
        System.out.println("resolveSibling 替换最后一个部分");
        System.out.println(Paths.get("z/c/y").resolveSibling("1.txt"));

     /*   System.out.println("============使用File类进行复制============");
        Path source = Path.of("data.txt");
        Path target = Path.of("z/data.txt");

        System.out.println("创建父目录");
        Files.createDirectories(target.getParent());
        System.out.println("复制文件，替换已存在文件");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);*/
    }
}
