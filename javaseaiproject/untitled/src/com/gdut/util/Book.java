package com.gdut.util;

public class Book {
    private String name;
    private int page;


    public Book(){}

    public Book(String name,int page){
        if (page <= 200){
            System.out.println("您输入的书名是"+ name+"页数过小");
        }else{
            this.name = name;
            this.page = page;
            System.out.println("您输入的书名是：" + name + "，书页数是：" + page);
        }

    }

    public String getName() {
        return name;
    }

    public int getPage() {
        if (page <= 200){
            System.out.println("您输入的书名是"+ name+"页数过小");
        }else{
            System.out.println("您输入的书名是：" + name + "，书页数是：" + page);
        }
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setName(String name){
        this.name = name;
    }

}
