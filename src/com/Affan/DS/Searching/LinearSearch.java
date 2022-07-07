package com.Affan.DS.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5,6,7,8,9,10,11,-22,22,33,44,55,66,77,88,99};
        int target=-22;
        int ans=linearsearch(nums,target);
       // System.out.println("element("+target+") found at index "+ans);
        System.out.println(ans);
        System.out.println(linearsearch2(nums,99));
//        System.out.println(ls(nums,target));
        System.out.println(ls(nums,66));
    }

    static int linearsearch(int []arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }

    static int linearsearch2(int []arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {  //returns the target element
                return element;
            }

        }
        return -1;
    }

    static int ls(int []arr,int target){
        if (arr.length==0){
            return  -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int elemennt=arr[i];
            if (elemennt == target){
                return elemennt;
            }
        }
        return -1;
    }
}
