package com.Affan.LeetCodes;

public class Q1672_LeetCode {
    public static void main(String[] args) {
          int [][] accounts={
            {1,2,3},
            {4,5,6},
            {8,8,8}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];  // adding all the elements index
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
