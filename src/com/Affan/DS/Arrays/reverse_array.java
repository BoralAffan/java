package com.Affan.DS.Arrays;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {

        int []arr={22,48,94,99,12};
        System.out.print("Before reverse---> ");
        System.out.println(Arrays.toString(arr));

        System.out.print("After reverse---> ");
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int []arr){
        int start=0;
        int end = arr.length -1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int []arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
