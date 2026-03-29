package day5;

public class Car {

    String make = "Ford福特";
    int year = 2026;
    double price = 50000;
    boolean isElectric = false;

    void start(){
        isElectric = true;
        System.out.println("you start the engine");
    }
    void stop(){
        System.out.println("you stop the engine");
    }
    void drive(){
        System.out.println("you drive the " + make);
    }
    void brake(){
        System.out.println("you brake the " + make);
    }
}
