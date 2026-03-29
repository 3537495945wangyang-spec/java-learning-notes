package com.gdut.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Test4 {
    public static void main(String[] args) {
        //学习构造器方法引用

//        CarFactory CF = new CarFactory() {
//            @Override
//            public Car getCar(String name) {
//                 return new Car( name);
//            }
//        };

//        CarFactory CF =  name ->  new Car( name);

        CarFactory CF = Car::new;


        Car c1 = CF.getCar("保时捷");
        System.out.println(c1);
    }
}



interface CarFactory{
    Car getCar( String name);

}
@Data
@NoArgsConstructor
@AllArgsConstructor

class Car{
    private String name;
}