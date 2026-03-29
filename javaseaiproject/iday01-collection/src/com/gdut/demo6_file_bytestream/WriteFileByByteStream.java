package com.gdut.demo6_file_bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileByByteStream {
    public static void main(String[] args) {
    try(FileOutputStream file = new FileOutputStream("output.txt" , true  )){
        String content = "Hello IOStream";
        file.write(content.getBytes());

        file.write(85);

    }catch (IOException e){
        System.out.println(e.toString());
    }
    }
}
