package com.gdut.demo;

public class Test {
    public static void main(String[] args) {
        University[] uni = new University[4];
        uni[0] =new  University(1,"华南师范大学",600,"zm");
        uni[1] =new  University(2,"东华大学",620,"cyc");
        uni[2] =new  University(3,"广东工业大学",560,"zcy");
        uni[3] =new  University(4,"喀什大学",520,"ll");



        MovieOperator mo = new MovieOperator(uni);
        mo.printAlluni();
        mo.searchuniByid();
    }

}
