package com.Affan.DS.Arrays;

public class Min_Max {
    public static void main(String[] args) {
        int [] arr={22,33,55,66,77,88,9999,-1,-2};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Largest element: " + max + " & " +" smallest element : " + min);
    }
}

