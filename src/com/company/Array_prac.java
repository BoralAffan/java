package com.company;

import java.util.Scanner;

public class Array_prac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]==6){
                System.out.println("number found at index "+i);
            }
            System.out.println(arr.length);
        }
    }
}
