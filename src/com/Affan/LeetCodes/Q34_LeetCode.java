package com.Affan.LeetCodes;

public class Q34_LeetCode {
    public static void main(String[] args) {

    }
public int [] searchRange(int []nums, int target){
        int []ans ={-1,-1};
        int start=search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
//    int start =0;
//    int end = nums.length - 1;
//    while (start <= end){
//        // int mid = (start + end)/2;
//        int mid = start + (end - start) / 2;   // it is same as (start + end)/ 2
//
//        if (target < nums[mid]){ //if true search in left
//            end = mid - 1;
//        }
//        else  if (target > nums[mid]){ // if true search in right
//            start = mid + 1;
//        }
//        else {
//            return mid;
//            //potential ans found
//        }
//
//    }
//    return ans;
}
int search(int[]nums,int target,boolean findStartIndex){
        int ans =-1;
    int start =0;
    int end = nums.length - 1;
    while (start <= end){
        // int mid = (start + end)/2;
        int mid = start + (end - start) / 2;   // it is same as (start + end)/ 2

        if (target < nums[mid]){ //if true search in left
            end = mid - 1;
        }
        else  if (target > nums[mid]){ // if true search in right
            start = mid + 1;
        }
        else {
            ans = mid;
            if (findStartIndex){
                end=mid -1;
            }
            else {
                start = mid +1;
            }
            //potential ans found
        }

    }
    return ans;
}
}
