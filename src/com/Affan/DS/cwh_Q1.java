package com.Affan.DS;
//find element is present or no
public class cwh_Q1 {
    public static void main(String[] args) {
        int [] arr={22,48,98,22};
        int target=22;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                System.out.println("element found at index :" + i);

            }
        }

    }
}
