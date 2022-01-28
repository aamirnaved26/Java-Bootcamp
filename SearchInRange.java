package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(rangeeSearch(arr,5,2,7));

    }

    private static int rangeeSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return i;
            }
        }

        return -1;


    }
}
