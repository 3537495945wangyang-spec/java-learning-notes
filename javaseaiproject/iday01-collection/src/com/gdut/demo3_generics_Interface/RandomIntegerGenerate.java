package com.gdut.demo3_generics_Interface;

public class RandomIntegerGenerate implements Generics<Integer>{
    private int max;
    public RandomIntegerGenerate(int max){
        this.max = max;
    }
    @Override
    public Integer generate() {
        return (int)(Math.random()*max);
    }
}
