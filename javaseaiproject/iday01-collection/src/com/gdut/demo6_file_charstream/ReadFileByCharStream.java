package com.gdut.demo6_file_charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileByCharStream {
    public static void main(String[] args) {
        //1.创建流对象，关联文件
        try(FileReader file1 = new FileReader("test.txt")){
            //2.读取数据 一次只读一个字节
            int b;
            while((b = file1.read()) != -1){//读到末尾返回-1
                System.out.print((char)b);//字节转字符
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileReader file2 = new FileReader("test.txt")){
            char[] cs = new char[1024];
            int len;//读取的字节数
            while((len = file2.read(cs)) != -1){
                System.out.println(new String(cs,0,len));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader file1 = new BufferedReader(new FileReader("input.txt"))){
            String line;
            while((line = file1.readLine()) != null){//按行读取
                System.out.println(line);//直接打印一行
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }

    }
}
