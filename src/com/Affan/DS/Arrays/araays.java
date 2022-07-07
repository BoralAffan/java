package com.Affan.DS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] arr = new int [5];
//       // int [] arr1 = new int [5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//
//        }


        String []str= new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }

        System.out.println("\n"+Arrays.toString(str));
    }
}
