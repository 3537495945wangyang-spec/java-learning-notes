package day5;

public class Ccar {
    String model;
    String color;

    Ccar(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("you drive the " + color + " " + model);
    }
}
