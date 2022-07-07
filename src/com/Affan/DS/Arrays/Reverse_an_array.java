package com.Affan.DS.Arrays;

import java.util.Arrays;

public class Reverse_an_array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};

        System.out.print("Before reverse---> ");
        System.out.println(Arrays.toString(arr));

        System.out.print("After reverse---> ");
       // rev(arr);
        recurssive_reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void rev(int []arr){
     int start=0;
     int end=arr.length -1;

     while (start <end){
         swaping(arr,start,end);
         start++;
         end--;
     }
    }

    static void swaping(int []arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static void recurssive_reverse(int []arr,int start, int end){
        if (start>=end){
            return;
        }
       int t=arr[start];
        arr[start]=arr[end];
        arr[end]=t;

        recurssive_reverse(arr,start+1,end-1);
    }
}
