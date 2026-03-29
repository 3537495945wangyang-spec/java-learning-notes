package com.gdut.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeTUTU {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("给出要筛数值的范围n，找出以内的素数：");
        int n1=input.nextInt();
        //int n2= (int) Math.sqrt(n1);
        int count = 0;
        int count1 = 0;
        List<Integer> filter=new ArrayList<>();

        for(int i = 2 ; i <= n1 ; i++) {
            filter.add( i );
        }

        do {
            if (count == filter.size()){
                break;
            }
            int first = filter.get(count);
            filter.removeIf(n -> n != first && n % first == 0);
            count++;
        }while (filter.getLast() > filter.getFirst() * filter.getFirst());

        for (int j = 0; j < filter.size(); j++) {
            count1 = count1 + 1;
            System.out.print(filter.get(j) + " ");
            if (count1 % 10 == 0) {
                System.out.println();
            }
        }
    }
}
