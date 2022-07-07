package com.Affan.DS.Sorting;


import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={5,0,8,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void selection(int [] arr){
       for (int i = 0; i < arr.length; i++) {
           //find the max in the remaining array and swap it with correct index
           int last= arr.length - i - 1;
           int maxIndex=getMaxIndex(arr,0,last);
           swap(arr,maxIndex,last);
//           int maxIndex=getMax(arr,0,last);
//           swap1(arr,maxIndex,last);
       }
   }

     public static int getMaxIndex(int[] arr,int start, int end) {
       int max=start;
         for (int i = 0; i <=end; i++) {
            if (arr[max] <arr[i]){
                max=i;
             }
         }
         return  max;
    }

    static void swap(int[] arr ,int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

//    static void swap1(int []arr, int first,int second){
//        int temp = arr[first];
//        arr[first]=arr[second];
//        arr[second]=temp;
//    }
//
//    static int getMax(int []arr,int start,int end){
//        int max=start;
//        for (int i = 0; i <=end; i++) {
//            if (arr[max] < arr[i]){
//                max=i;
//            }
//        }
//        return max;
//    }
}
