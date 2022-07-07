package com.Affan.DS.Arrays;
//   https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
public class Q1_arrays {
    public static void main(String[] args) {
         int [] arr={1,33,44,-9,-6,47749,48};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int max(int []arr){
        if(arr.length==0){
            return -1;
        }

        int maximum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }


    static int min(int []arr){
        if(arr.length==0){
            return -1;
        }

        int minimum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }
}
