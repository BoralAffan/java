package com.Affan.DS.Arrays.LoveBaber_Arrays;

public class Q2_Max_Min_In_Array {
    public static void main(String[] args) {
        int [] arr={99,92,-1,-6,-9,100,999};
        int [] [] arr3={
                {1,2,3,-4},
                {99,87,64,0},
                {48,19092,-88}
        };
        int max=0;
        int min=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            else if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println("Max element : " + max + " Min element : " + min);

        _2DArray(arr3);
    }

    static void _2DArray(int [] [] arr){
        int max =0;
        int min=0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max=arr[row][col];
                }
                else if(arr[row][col] < min){
                    min=arr[row][col];
                }
            }
        }
        System.out.println("Max element : " + max);
        System.out.println("Min element : " + min);
    }
}
