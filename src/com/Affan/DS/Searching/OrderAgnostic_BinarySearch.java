package com.Affan.DS.Searching;

public class OrderAgnostic_BinarySearch {
    public static void main(String[] args) {
     int [] arr ={-18,-12,-4,0,2,3,4,15,55,66};
     int target = 15;
     int ans = orderAgnostics(arr,target);
        System.out.println(ans);
    }

    static int orderAgnostics(int []arr, int target){
        int start =0;
        int end = arr.length - 1;

        /*find the array whether it is sorted in
        ascending or descending */
        boolean isAscending= arr[start] < arr[end];

        while (start <= end){
            // int mid = (start + end)/2;
            int mid = start + (end - start) / 2;   // it is same as (start + end)/ 2

            if (arr[mid] == target){
                return mid;
            }

            if (isAscending){
                if (target < arr[mid]){ //if true search in left
                    end = mid - 1;
                }
                else {  // if true search in right
                    start = mid + 1;
                }
            }
            else  {
                if (target > arr[mid]){ //if true search in left
                    end = mid - 1;
                }
                else {
                    start = mid - 1;
                }
            }
        }
        return -1;
    }
}
