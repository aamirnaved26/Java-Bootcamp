package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr =
                {{1,2,3},
                {4,5},
                {7,8,9,10,17}};
        int[] ans = twoDSearch(arr,10);
        //answer will contain [row , column]
        System.out.println(Arrays.toString(ans));
    }

    private static int[]twoDSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
