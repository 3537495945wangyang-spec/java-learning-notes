package com.gdut.demo3_generics_Interface;

public class RandomTest {
    public static void main(String[] args) {

        Generics<Integer> generate = new RandomIntegerGenerate(100);
        System.out.println(generate.generate());

    }
}
