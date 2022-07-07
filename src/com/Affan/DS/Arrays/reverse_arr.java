package com.Affan.DS.Arrays;

import java.util.Arrays;

public class reverse_arr {
    public static void main(String[] args) {
        int [] ar= {1,2,3,4,5,6,7,8,9};

        System.out.println("Before swapping ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        rev(ar);
        System.out.println("after swapping");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

    }
    static void rev(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
           swap(arr,start,end);
            start++;
            end--;

        }

    }

    static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
