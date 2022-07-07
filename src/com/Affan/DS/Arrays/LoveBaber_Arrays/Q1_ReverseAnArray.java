package com.Affan.DS.Arrays.LoveBaber_Arrays;
// question is to reverse an array

public class Q1_ReverseAnArray {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7};
        int [] arr2 ={9,0,0,4,2,6,6,1,1,0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("After reverse ");
         reverse_using_recurssion(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("After reverse ");
        reverse(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

   private static void reverse(int [] arr ){
        int start =0;
        int end= arr.length-1;

        while (start<=end){
            int temp=arr[start];
            arr[start] =arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
   }

   private static void reverse_using_recurssion(int [] arr, int start , int end){
        if (start>=end){
            return;
        }
       int temp=arr[start];
       arr[start] =arr[end];
       arr[end]=temp;

       reverse_using_recurssion(arr,start+1,end-1);

   }
}
