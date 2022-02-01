package com.company;

public class CielingOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(bs(arr,target));
    }

    static int bs(int[] arr, int target){ 
        int mid = 0;
        int l = 0;
        int h = arr.length -1 ;
        while (l<=h){
           mid = l + (h-l) / 2;
            if (target < arr[mid]) {
                h = mid -1;
            }
            else if (target > arr[mid]) {
                l = mid + 1;
            }
            else return arr[mid];
        }
        /*
        when th condition is violated (l>h) means
        target is not found h is now behind l
        then the next grater element would be at index l
         */
      return arr[l];
    }

}
