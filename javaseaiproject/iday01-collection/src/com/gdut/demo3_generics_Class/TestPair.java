package com.gdut.demo3_generics_Class;

public class TestPair {

    public static void main(String[] args) {
        //创建一个Pair对象记录一个学生的学号和姓名
        Pair<Long,String> StudentID = new Pair<>();
//        StudentID.setPair(3125003420L,"正串月");
//        System.out.println(StudentID.getPair());

        StudentID.setFirst(3125003420L);
        StudentID.setSecond("正串月");
        System.out.println(StudentID.getFirst() + " " +
                StudentID.getSecond());
        System.out.println(StudentID);

        //创建一个Pair对象记录一个商品的品牌，价格和名称
        Pair<String,Product> product = new Pair<>();
        product.setFirst("小米");
        product.setSecond(new Product("15pro",5999.9));
        System.out.println(product.getFirst() + " " +
                product.getSecond());
        System.out.println(product);
    }
}
