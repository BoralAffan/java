package com.Affan.DS.Searching;

public class search_in_range {
    public static void main(String[] args) {
        int [] arr={11,232,332,465,576,644};
        int start=2;
        int end = 5;
        int target = 576;
        System.out.println(search(arr,target,start,end));
        System.out.println(search2(arr,target,start,end));
    }

    //search the element and return the index of the target element
    static int search(int []arr,int target, int start , int end){
        if (arr.length ==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }


    static int search2(int []arr,int target, int start , int end){
        if (arr.length ==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target){
                return element;
            }
        }
        return -1;
    }
}
