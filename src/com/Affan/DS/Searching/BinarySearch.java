package com.Affan.DS.Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr ={66,77,450,765,890,900,999};
       int []arr2= {99,88,77,66,55,44,33,22};
        int target =9080;
        int target2=66;
       int ans= binarysearch(arr,target);
       int ans2=binarysearch(arr2,target2);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int binarysearch(int [] arr, int target){
     int start =0;
     int end = arr.length - 1;
     while (start <= end){
        // int mid = (start + end)/2;
         int mid = start + (end - start) / 2;   // it is same as (start + end)/ 2

         if (target < arr[mid]){ //if true search in left
             end = mid - 1;
         }
         else  if (target > arr[mid]){ // if true search in right
             start = mid + 1;
         }
         else {
             return mid;  // ans found
         }

     }
     return -1;
    }
}
