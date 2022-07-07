package com.Affan.DS.Arrays;

public class array_2D {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{33,55},{22,98,67},{99}};

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println(" ");
        }


        System.out.println("-----------------------------------");
        System.out.println(search(arr,999));
    }
    static int search(int [][] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return target;
                }
            }
        }
        return -1;
    }
}
