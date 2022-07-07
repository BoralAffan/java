package com.Affan.DS.Arrays;

public class search {
    public static void main(String[] args) {
        int [] arr={2,5,7,22,44,77,04,99};
        int target1=77;
        int target2=99;
       System.out.println("Element "+ target1 + " found at index "+ linearsearch(arr,target1));

        System.out.println("Element "+ target2 + " found at index "+ binarySearch(arr,target2));

        max(arr);
    }

    static int linearsearch(int [] arr,int target){
        int i;
        for (i=0; i < arr.length ; i++) {
            if(target==arr[i]){
                return i;
            }
        }
        return i;
    }

    static int binarySearch(int [] arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid=(start + end) /2;
            if (target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static void max(int []arr){
        int maximum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maximum){
                maximum=arr[i];
            }

        }
        System.out.println(maximum);
    }
}
