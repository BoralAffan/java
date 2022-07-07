package com.Affan.DS.Arrays;

public class max_min_matrix {
    public static void main(String[] args) {
        int [][] arr={
                {22,42,34,10022},
                {-1,-2222,0,86,98},
                {21,98,1000,-100}
        };
        max_min(arr);
    }

    static void max_min(int [][] arr){
        int max=0;
        int min=0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max=arr[row][col];
                }
                else if(arr[row][col]< min){
                    min=arr[row][col];
                }
            }

        }
        System.out.println("Maximum in matrix is : " + max + " Minimun in matrix is : " +min);
    }
}
