package com.gdut.demo3_generics_InterfaceManager;

public interface DataManager <T>{
    void add(T t);
    void remove(T t);
    void update(T t);
    //查询
     T find(String id);
     //打印
    void print();
}

