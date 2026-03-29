package Math;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
       Random random = new Random();
       int x = random.nextInt(6) + 1;
       boolean y = random.nextBoolean();

        System.out.println(x);
       System.out.println(y);


       String day = "Friday";
       switch(day) {
           case "Monday":
               System.out.println("Today is Monday");
               break;
           case "Tuesday":
               System.out.println("Today is Tuesday");
               break;
           case "Wednesday":
               System.out.println("Today is Wednesday");
               break;
           case "Thursday":
               System.out.println("Today is Thursday");
               break;
           case "Friday":
               System.out.println("Today is Friday");
       }


       int temp = 25;
       if(temp > 30){
           System.out.println("It's hot outside");
       } else if (temp > 20 && temp <=30) {
           System.out.println("It's warm outside");
       }else if (temp > 10 && temp <=20) {
           System.out.println("It's cold outside");
       } else {
           System.out.println("It's very cold outside");
       }

       String respond = "q";
       if(respond.equals("q") || respond.equals("Q")) {
           System.out.println("Goodbye");
        }else {
           System.out.println("Still playing");
       }


        Scanner sc = new Scanner(System.in);
       String name = "";
       while(name.isBlank()){
           System.out.println("Enter your name: ");
           name = sc.nextLine();
       }
       System.out.println("Hello " + name);


       int rows;
       int columns;
       String symbol;
       System.out.println("Enter number of rows: ");
       rows = sc.nextInt();
       System.out.println("Enter number of columns: ");
       columns = sc.nextInt();
       System.out.println("Enter symbol: ");
       symbol = sc.next();
       for(int i = 1;i<=rows;i++){
           System.out.println();
           for(int j = 1; j<=columns;j++){
               System.out.print(symbol);
           }
       }

    }
}
