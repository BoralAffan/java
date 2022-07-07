package com.Affan.DS.Arrays;

public class rev_arr {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverse(arr);
        System.out.println("reverse using temp ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reverse_recurssion(arr,0,arr.length-1);
        System.out.println("reverse using recurssion ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse_recurssion(int [] arr, int start, int end){
        if (start>=end){
            return;
        }
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]= temp;

        reverse_recurssion(arr,start+1,end-1);
    }

    static void reverse(int [] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
