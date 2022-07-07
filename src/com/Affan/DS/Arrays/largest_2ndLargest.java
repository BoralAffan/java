package com.Affan.DS.Arrays;

public class largest_2ndLargest {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,566,77,8};

        largest_2ndLrgest(arr);
    }

    static void largest_2ndLrgest(int [] arr){
        int largest=0;
        int _2ndLargest=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                _2ndLargest=largest;
                largest=arr[i];
            }
            else if (arr[i]>_2ndLargest){
                _2ndLargest=arr[i];
            }
        }
        System.out.println("Largest is : " + largest + " second largest is : " + _2ndLargest);
    }
}
