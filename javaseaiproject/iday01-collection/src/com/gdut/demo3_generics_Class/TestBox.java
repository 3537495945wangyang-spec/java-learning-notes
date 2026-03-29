package com.gdut.demo3_generics_Class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class TestBox{

    public static void main(String[] args) {
        //创建一个装字符串的盒子
        Box<String> box1 = new Box<>();
        box1.setContent("hello");
        System.out.println(box1.getContent());
        System.out.println(box1);

        //创建一个装整数的盒子
        Box<Integer> box2 = new Box<>();
        box2.setContent(10086);
        System.out.println(box2.getContent());
        System.out.println(box2);

        //创建一个装商品的盒子
        Box<Product> box3 = new Box<>();
        box3.setContent(new Product("小米15",5999.9));
        System.out.println(box3.getContent());
        System.out.println(box3);

        Box<Integer> n1 = new Box<>();
        Box<Integer> n2 = new Box<>();
        Box<Integer> n3 = new Box<>();

        n1.getContent();
    }
    
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Product{
    private String name;
    private double price;
}