package day4;

import java.util.ArrayList;
import java.util.List;

public class Day4 {
    public static void main(String[] args) {
        String name = "  Stick  ";

        //boolean result = name.equals("Stick");

        //int result = name.length();

       // char letter = name.charAt(0);

        //int result = name.indexOf("S");

        //boolean result = name.isEmpty();

        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();//移除空白
        String result = name.replace('t','l');

        System.out.println(result);

        List<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        food.set(0,"sushi");
        food.remove(2);
        food.clear();
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

        List<ArrayList<String>> groceeyList = new ArrayList<>();

        ArrayList<String> BakeryList = new ArrayList<>();
        BakeryList.add("pasta");
        BakeryList.add("garlic bread");
        BakeryList.add("donuts");

        for(String s:BakeryList){
            System.out.println(s);
        }

        ArrayList<String> ProduceList = new ArrayList<>();
        ProduceList.add("tomatoes");
        ProduceList.add("zucchini");


        ArrayList<String> DrinkList = new ArrayList<>();
        DrinkList.add("soda");
        DrinkList.add("coffee");

        groceeyList.add(BakeryList);
        groceeyList.add(ProduceList);
        groceeyList.add(DrinkList);
        System.out.println(groceeyList);
        System.out.println(groceeyList.get(0).get(1));





    }

}
