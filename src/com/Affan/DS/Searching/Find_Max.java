package com.Affan.DS.Searching;

public class Find_Max {
    public static void main(String[] args) {
        int [] arr ={-1,-2,-33,-44,-55,-6,-9,-10,-99,-57,-567,0,-6757};
        int [] arr2 ={23,55,54,657,9879,234,987,435,29045};
        System.out.println(Maximum(arr));
        System.out.println(Maximum(arr2));
        System.out.println(Minimum(arr));
        System.out.println(Minimum(arr2));
    }
    static int Maximum(int []arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }


    static int Minimum(int []arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
