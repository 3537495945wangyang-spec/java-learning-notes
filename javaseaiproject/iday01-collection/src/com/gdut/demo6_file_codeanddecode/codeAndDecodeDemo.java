package com.gdut.demo6_file_codeanddecode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class codeAndDecodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "ZM你是最棒的，牛逼666";

        //编码
        //默认编码格式是utf-8
        byte[] bytes = str.getBytes();
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        //可设置为 GBK
        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(bytes1.length);
        System.out.println(Arrays.toString(bytes1));

        //解码
        //默认编码格式是utf-8
        String s1 = new String(bytes);
        System.out.println(s1);
        //可设置为 GBK
        String s2 = new String(bytes1,"GBK");
        System.out.println(s2);


    }
}
