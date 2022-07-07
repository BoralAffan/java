package com.Affan.LeetCodes;

public class arr {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        print(a);

    }

    static void print(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    static void even(int []arr){
        int odd_count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2!=0){
                odd_count++;
            }
        }

        int[] newArray = new int [odd_count];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
            {
                newArray[index] = arr[i];
                index++;
            }
        }
        System.out.println(newArray);

        }
    }

