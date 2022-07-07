package com.Affan.DS.Arrays;

public class P1_Arrays {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " "  );
        }
        System.out.println();

        search(arr,5);


        int [][] arr2={
                {1,2,3,4},
                {55},
                {6,7,8}
        };

    _2Dprint(arr2);
    SearhIn2D(arr2,8);
    maxIn2D(arr2);

    }



    static void search(int []arr, int target){

        if(arr.length==0){
            System.out.println("eror");
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("target found at index "+ i);
            }
        }

    }

    static void _2Dprint(int [][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void SearhIn2D(int [][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    System.out.println("Element found at index "+ "["+ row +","+col+"]");
                }
            }
        }
    }

    static void maxIn2D(int [][] arr){
        int max=Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        System.out.println(max);
    }



}
