package com.Affan.DS.Arrays.LoveBaber_Arrays;

public class Q4_sorting_0And1 {
    public static void main(String[] args) {
        int [] arr ={0,1,2,2,0,1,0,1,0};
        System.out.println("Before sorting ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
     sorting0_1(arr);
        System.out.println("After sorting ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sorting0_1(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
