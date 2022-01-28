package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>(6);
//        //to add element
//        list.add(10);
//        // to update
////        list.set(2,11);
//        //to print or extract
//        System.out.println(list.get(0));

        //MultiD arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Initialization
        for (int i = 0; i<3 ; i++){
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
            list.get(i).add(in.nextInt());}
        }
//        for (int i = 0; i < 3; i++){
//            System.out.println(list.get(i));
//        }
        System.out.println(list);
    }
}
