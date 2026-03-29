package com.gdut.demo6_file_charstream;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class yes{
    public static void main(String[] args) throws IOException {
        int a = 1024;
        byte[] bytes = new byte[a*a*a];
        int i = 0;
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\a.txt",true);
        for(int j=0;j<a;j++){
            fileOutputStream.write(97);
        }
        FileInputStream fileInputStream = new FileInputStream("D:\\a.txt");
        int b;
        while((b = fileInputStream.read()) != -1){
            bytes[i] = (byte)b;
            i++;
        }
        for(int j=0;j < a;j++){
            fileOutputStream.write(bytes);
        }
        fileInputStream.read(bytes);
        for(int j=0;j < 512;j++){
            fileOutputStream.write(bytes);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}