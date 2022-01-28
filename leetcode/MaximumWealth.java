package com.company.leetcode;


class Solution {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{2,2,1}};
        System.out.println(maximumWealth(arr));

    }
   static int maximumWealth(int[][] accounts) {
int max = 0;
int sum = 0;
for (int row = 0; row < accounts.length; row++){
    for (int col = 0; col < accounts[row].length; col++){
        sum = sum + accounts[row][col];
    }
   if (max < sum){
       max = sum;
   }
   sum = 0;


}
return max;
    }

}