package com.Affan.DS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2D_array {
    public static void main(String[] args) {


        int [][] arr={{1,2,3,4},{5,8},{8,5,7},{57}};



        //printing  2d array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }
        System.out.println("_-_-_-_-_-_-_-_-_-_-");

        System.out.println( search(arr,57));
    }





    //searching element in 2d array
    static int search(int [][]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element=arr[row][col];
                if (element==target){
                    return element;
                }
            }
        }
        return -1;
    }


    static int srch(int [][] arr, int target){
        if (arr.length ==0){
            return  -1;
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


