package com.gdut.demo7_path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FilesDemo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("=============文件创建与删除============");
        System.out.println("创建文件");
        Path newFile = Files.createFile(Path.of("Z:\\code\\File\\newFile.txt"));
        System.out.println("创建目录");
        Path newDir = Files.createDirectory(Path.of("Z:\\code\\File\\newDir"));
        System.out.println("创建多层目录");
        Path newDirs = Files.createDirectories(Path.of("Z:\\code\\File\\newDir\\newDirs"));
        System.out.println("删除文件，如果不存在则不删除");
        boolean b = Files.deleteIfExists(Path.of("Z:\\code\\File\\newFile.txt"));


        System.out.println("============文件的复制与移动==============");
        Path source = Path.of("source.txt");
        Path target = Path.of("z/target.txt");
        System.out.println("复制文件，替换已存在文件");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("复制文件并保留原先的属性");
        Files.copy(source,target,StandardCopyOption.COPY_ATTRIBUTES,StandardCopyOption.REPLACE_EXISTING);
        System.out.println("移动重命名文件");
        Files.move(source,Path.of("c/tat.txt"),StandardCopyOption.ATOMIC_MOVE);

        System.out.println("============文件的读取与写入==============");
        System.out.println("读取所有字节");
        byte [] bytes = Files.readAllBytes(Path.of("Z:\\code\\File\\newFile.txt"));
        System.out.println("写入字节");
        byte[] data = "Hello Files".getBytes();
        Files.write(Path.of("Z:\\code\\File\\newFile.txt"),data);
        System.out.println("追加字节");
        Files.write(Path.of("Z:\\code\\File\\newFile.txt"),"BYE Files".getBytes(), StandardOpenOption.APPEND);


        System.out.println("=================文本操作==================");
        System.out.println("读取所有行");
        List<String> lines = Files.readAllLines(Path.of("Z:\\code\\File\\newPoem.txt"));

        System.out.println("写入行");
        List<String> poems = Arrays.asList("Java张沙清","Engilsh赵峰");
        Files.write(Path.of("Z:\\code\\File\\newPoem2.txt"),poems);

        System.out.println("使用BufferedReader 高效读取");
        try(BufferedReader br = Files.newBufferedReader(Path.of("Z:\\code\\File\\newPoem.txt"))){
            String line = null;
            while((line =br.readLine()) != null){
                System.out.println( line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("使用BufferedWriter 高效写入");
        try(BufferedWriter bw = Files.newBufferedWriter(Path.of("Z:\\code\\File\\newPoem2.txt"))){
            bw.write("Java张沙清");
            bw.newLine();
            bw.write("Engilsh赵峰");
            bw.newLine();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }




    }
}
