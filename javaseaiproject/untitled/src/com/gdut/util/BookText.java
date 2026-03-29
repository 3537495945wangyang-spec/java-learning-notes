package com.gdut.util;

public class BookText {

    public static void main(String[] args) {


        Book b1 = new Book("校园春风",234);
        Book b2 = new Book("师者匠心",56);


        b1.getPage();
        b2.getPage();
        System.out.println(b1.getName());

    }
}
