package com.Affan.DS.Arrays;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/sort-the-array0055/
public class Q3_arrays {
    public static void main(String[] args) {
        int[] arr={33,44,11,21,10,9,100};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        sortArr(arr,5);
        System.out.println(Arrays.toString(arr));

         Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int sortArr(int[] arr, int n)
    {
        // code here
        for (int i = 0; i < n; i++) {
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        return 1;
    }
}
