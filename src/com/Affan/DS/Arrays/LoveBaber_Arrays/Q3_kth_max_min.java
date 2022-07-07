package com.Affan.DS.Arrays.LoveBaber_Arrays;
import java.util.*;
import java.util.Arrays;

public class Q3_kth_max_min {
    public static void main(String[] args) {
        int [] arr={1,44,55,23,99};
        int [] arr2={1,2,3,4};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
kth_smallest(arr,2);
kth_largest(arr,2);





    }

    static void kth_smallest(int [] arr,int k){
        sort(arr);
        System.out.println(k + "th smallest no is "+ arr[k -1]);
    }




    static void kth_largest(int [] arr, int k){
              sort_in_descending(arr);
        System.out.println(k + "th largest no is "+ arr[k -1]);
    }


    static void sort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j -1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else {
                    break;
                }
            }

        }
    }


    static void sort_in_descending(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length  ; j++) {
                if (arr[i] < arr[j]){            // 1 2 3 4
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }



}
