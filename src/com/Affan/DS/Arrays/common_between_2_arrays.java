package com.Affan.DS.Arrays;

public class common_between_2_arrays {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={2,8,9,2,5};
        CommonBetwnArrays(arr1,arr2);
    }
    static void CommonBetwnArrays(int [] arr1,int [] arr2){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    System.out.println("Common element : " + arr1[i]);
                }
            }
        }
    }
}
