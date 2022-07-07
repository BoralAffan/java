package com.Affan.DS.Arrays;

public class sort {
    public static void main(String[] args) {
        int [] arr={33,44,11,21,10,9,100};
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Sorting(arr);
        System.out.println("Aters sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void Sorting(int []arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

        }
    }
}
