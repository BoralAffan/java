package com.Affan.DS.Arrays;
import java.util.Arrays;


//swapping elements in an array by giving index

public class swap {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,44,33};
//        System.out.println(arr);
        Swap(arr,5,6);
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int []arr, int a, int b){
//        if (arr.length==0){
//            System.out.println("empty array");
//        }
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
