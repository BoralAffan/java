package com.Affan.DS.Arrays;

public class kth_sum_pair {
    public static void main(String[] args) {

        int [] arr={2,3,4,2,6,10,8};
        int start =0;
        int end = arr.length-1;
        int sum= 10;

        while (start < end){
            if (arr[start] + arr[end] > sum){
                end--;
            }
            else if (arr[start] + arr[end] < sum){
                start++;
            }
            else if(arr[start] + arr[end] ==sum){
                System.out.println("Pair "+"( "+ arr[start] + " , " + arr[end] + " )");
                start++;
                end--;
            }
        }
    }
}
