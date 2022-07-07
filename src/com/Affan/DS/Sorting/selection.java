package com.Affan.DS.Sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int []arr={5,-2,8,2,0};
       //selection(arr);
        ins(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length -i -1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getMaxIndex(int [] arr,int start,int end){
        int max=start;
        for (int i = 0; i <=end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int []arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void insertion(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
    }









    static void ins(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
}

