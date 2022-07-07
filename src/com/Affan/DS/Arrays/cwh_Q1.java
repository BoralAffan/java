package com.Affan.DS.Arrays;
//sum on float array
public class cwh_Q1 {
    public static void main(String[] args) {
        float [] arr={1.2f,3.4f,3.4f,4.6f};
        int [] arr2 ={1,2,3,4};
        int sum=0;
        float ans=0;
        for (int i = 0; i < arr2.length; i++) {
            sum=sum+arr2[i];
        }
        System.out.println(sum);


        for (int i = 0; i < arr.length; i++) {
            ans=ans+arr[i];
        }
        System.out.println(ans);
    }
}
