package com.Affan.DS.Arrays.LoveBaber_Arrays;
// qustion is to move all negative no one side
//1st approach is to sort , if we sort then the negative no will be opposite side
// another qustion in interview may ask to solve this q without sort
// so in 2nd approach we will initialize an empty array and in for loop we will apply condition that
// if element at ith index is positive then copy that element to answer array
// and after copying all positive elem we will add negative no in that array
public class Q5_move_negativeNo_oneside {
    public static void main(String[] args) {
        int [] arr={1,2,3,-1,-8,-2,9,1};
        int [] ans={};
// 1st approach
//after sorting the negative nos are one side
    //    _1st_approach_using_sort(arr);
        _2nd_approach(arr);

    }

    static void _1st_approach_using_sort(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    static void _2nd_approach(int [] arr){
        int [] Ans_Array = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0){
                arr[i]= Ans_Array[j++];
            }
            else if(j==arr.length || j==0){
                return;
            }
            else if(arr[i]<0){
                arr[i]=Ans_Array[j++];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(Ans_Array[i] + " ");
        }


    }
}
