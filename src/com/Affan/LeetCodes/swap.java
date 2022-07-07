package com.Affan.LeetCodes;

public class swap {

    public int swapping(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,2,4,5};
        System.out.println("before swapping");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " " );
        }
        System.out.println();

    }

}