package com.Affan.DS.Arrays;

import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int []arr={22,43,55,-9,88,11,23,43};



        System.out.println("max in the array is " + max(arr)+ " and min is " + min(arr));

        int [][] arr1={{77,87,34},{2},{87,999,33}};



        System.out.println("max in 2d array is " +  max_2d_array(arr1) + " and min is " + min_2d_array(arr1));
    }


    //it will find max in an array
    static int max(int [] arr){
        if (arr.length==0){
            return -1;
        }
        int m=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }


    static int min(int [] arr){
        if (arr.length==0){
            return -1;
        }
        int m=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<m){
                m=arr[i];
            }
        }
        return m;
    }


    static int max_2d_array(int [][] arr){
        if (arr.length==0){
            return -1;
        }
        int max=arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }

    static int min_2d_array(int [][] arr){
        if (arr.length==0){
            return -1;
        }
        int min=arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
    }
}
