package com.gdut.demo7_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class FilesDemo2Attribute {
    public static void main(String[] args) throws IOException {
        System.out.println("==========文件属性操作=========");
        var path = Paths.get("Z:\\StickingMoon\\wallpaper\\t01f5212ba707fe7c2c.jpg");
        System.out.println("\n文件大小");
        System.out.println(Files.size(path));

        System.out.println("\n检查文件类型");
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isRegularFile(path));//检查文件类型是不是正常文件
        System.out.println(Files.isHidden(path));//检查文件是否隐藏
        System.out.println(Files.isExecutable(path));//检查文件是否可执行

        System.out.println("\n获取最后修改时间");
        System.out.println(Files.getLastModifiedTime(path));

        System.out.println("\n设置最后修改时间");
        Files.setLastModifiedTime(path, FileTime.from(Instant.now()));
        System.out.println(Files.getLastModifiedTime(path));

        System.out.println("\n获取详细信息 BasicFileAttribute");
        BasicFileAttributes atr = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("创建时间" + atr.creationTime());
        System.out.println("最后访问时间" +atr.lastAccessTime());
        System.out.println("最后修改时间" +atr.lastModifiedTime());
        System.out.println("文件大小" +atr.size());
        System.out.println("是否是目录" +atr.isDirectory());
        System.out.println("是否是文件" +atr.isRegularFile());


    }
}
