package com.gdut.demo6_file_charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileByCharStream {
    public static void main(String[] args) {
    try(FileWriter file = new FileWriter("output.txt",true)){//这里的true表示追加，而不是覆盖
        file.write("Hello io");//写入字符串
        file.write('9');//写入字符
        file.write(97);//写入字符的ASCII码
        file.write(new char[]{'a','b','c'});//写入字符数组
    }catch(IOException e){
        System.out.println(e.toString());
    }

    try(BufferedWriter file1 = new BufferedWriter(new FileWriter("output.txt", true))){
        file1.write("第一行内容");
        file1.newLine();//换行
        file1.write("第二行内容");
        file1.newLine();
    }catch (IOException e){
        System.out.println(e.toString());
    }


    }
}
