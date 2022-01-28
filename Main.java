package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] nums = {1,3,4,2};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//    static  void change(int[] arr) {
//        arr[2] = 11;
        int[][] arr = new int[3][3];
        // arr.length gives row size
        //Taking input
        for (int row = 0; row< arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }

        }

        //Giving output
//        for (int row = 0; row< arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        //same as above
//        for (int row = 0; row< arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        /*
        enhanced for loop
        for(datatype which is inside array    var_name : target_array{}
         */
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }

}
