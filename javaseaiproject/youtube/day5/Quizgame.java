package day5;

public class Quizgame {
    public static void main(String[] args) {


        Car car = new Car();

        System.out.println(car);
        System.out.println(car.make);
        System.out.println(car.isElectric);
        car.start();
        System.out.println(car.isElectric);

        Student s1 = new Student("Spongebob",30,1.0);
        Student s2 = new Student();

        Ccar[] cars = new Ccar[]{
                new Ccar("Ford","Red"),
                new Ccar("Mustang","Black"),
                new Ccar("Tesla","White")};

        for(Ccar c : cars){
          c.drive();
        }

        Friends f1 = new Friends("Spongebob");
        Friends f2 = new Friends("Patrick");
        Friends f3 = new Friends("Sandy");

        System.out.println(Friends.numOfFriends);
        Friends.printNumOfFriends();
    }
}
