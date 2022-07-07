package com.Affan.LeetCodes;

public class Q852_LeetCode {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
      int start =0;
      int end = arr.length -1;
      while (start<end){
          int mid = start + (end - start)/2;
          if (arr[mid] > arr[mid +1]){
              //you are in decreasing part of array
              //this may be the ans but look in left

              end = mid;
          }
          else{
              start = mid +1;
          }
      }
      return start;
    }
}
