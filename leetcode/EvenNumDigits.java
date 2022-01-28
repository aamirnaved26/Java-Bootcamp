package com.company.leetcode;

public class EvenNumDigits {
    public static void main(String[] args) {
        int[] nums = {12,3413,12,61,7897};
//        System.out.println(findNums(nums));
//        System.out.println(noOfDigits(0));
        System.out.println(digits2(0));
    }

    private static int findNums(int[] nums) {
        int count = 0;
        for (int n : nums){
            if (even(n)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int n) {
        return noOfDigits(n) % 2 == 0;
    }
    static int digits2(int n){
        if (n < 0){
            n = n * -1;
        }
        if (n == 0){
            return 1;
        }
        return (int)(Math.log10(n)) + 1;

    }

    static int noOfDigits(int n){
        if (n < 0){
            n = n * -1;
        }
        if (n == 0){
            return 1;
        }
        int count = 0;
        while (n>0){
            count++;
            n = n/ 10;
        }
        return count;
    }


}
