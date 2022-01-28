package com.company;

import com.sun.source.tree.BreakTree;

public class searchLinear {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 22, 424, 1, 32, 23};
//        int ans = linearSearch(arr, 22);
//        System.out.println(ans);
//        System.out.println(arr[ans]);
//        System.out.println(linearSearch2(arr, 424));
        String name = "Aamir";
        System.out.println(searchString2(name, 'm'));


    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;

    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int element : arr) {
            if (element == target)
                return element;
        }

        return Integer.MAX_VALUE;

    }

    static boolean searchString(String str, char target) {
//        if (str == null){
//            return false;
//        }
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }

        }

        return false;
    }
    static boolean searchString2(String str, char target) {
//
        if (str.length() == 0) {
            return false;
        }

      // foreach loop needs an array to iterate over so convert string into char array;
       for(char s : str.toCharArray()){
           if (s == target)
               return true;
       }

        return false;
    }
}