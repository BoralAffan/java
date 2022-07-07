package com.Affan.DS.Arrays;

import java.util.Arrays;

public class Arrays_prac {
    public static void main(String[] args) {
        int [] nums={33,55,77,23,45,66};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int []arr){
        arr[0]=99;
    }
}
