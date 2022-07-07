package com.Affan.DS.Arrays;

public class Maximum {
    public static void main(String[] args) {
        int [] arr={9,22,67,18,-9};
        System.out.println(arr.length);
        System.out.println(max(arr));
        System.out.println(minimum(arr));
    }

    static int max(int []arr){
        if (arr.length==0){
            return -1;
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    static int minimum(int []arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

}
