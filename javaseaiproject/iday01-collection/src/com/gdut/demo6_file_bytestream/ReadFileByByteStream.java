package com.gdut.demo6_file_bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileByByteStream {
    public static void main(String[] args) {
        //1.创建流对象，关联文件
        try(FileInputStream file1 = new FileInputStream("test.txt")){
            //2.读取数据 一次只读一个字节
            int b;
            while((b = file1.read()) != -1){//读到末尾返回-1
                System.out.print((char)b);//字节转字符
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileInputStream file2 = new FileInputStream("test.txt")){
            byte[] bs = new byte[1024];
            int len;//读取的字节数
            while((len = file2.read(bs)) != -1){
                System.out.println(new String(bs,0,len));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
