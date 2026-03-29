package com.gdut.demo3_generics_Class;

public class Box<T> {
    private T content;//作为一个类型参数
    private Box<T> next;
    public Box(){};
    public Box(T content, Box<T> next) {
        this.content = content;
        this.next = next;
    }

    public Box<T> getNext() {
        return next;
    }

    public void setNext(Box<T> next) {
        this.next = next;
    }

    public void setContent(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }

    public String toString(){
       return "Box contains： " + content + " next: " + next;
    }
}

