package com.Affan.DS.Searching;

import java.util.Arrays;

public class Search_in_2D_Array {
    public static void main(String[] args) {
        int [][]arr={
                {1000,2,3},
                {4,5,6,7},
                {8,9,10,11,12},
                {48,99,11,24,54,657,88,-99,77,55,444,35}
        };

        int target = 657;
        int []ans =  search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(max1(arr));
        System.out.println(min(arr));
        System.out.println(maxWealth(arr));

    }
    static int[] search(int [][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }


    static int max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr  ) {
            for (int element: ints  ) {
                if (element>max){
                    max = element;
                }
            }
        }
        return max;
    }

    static int max1(int [][] arr){
      //  int element = arr[0][0];
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col]>ans){
                   // element = arr[row][col];
                    ans = arr[row][col];
                }

            }

        }
        return ans;
    }


    static int min(int [][] arr){
        int element = arr[0][0];
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // int element = arr[row][col];
                if (arr[row][col]<element){
                    element = arr[row][col];
                }

            }

        }
        return element;
    }

    static int maxWealth(int [][] arr){
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length ; row++) {
            int sum =0;
            for (int col = 0; col < arr[row].length; col++) {
                sum= sum + arr[row][col];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
