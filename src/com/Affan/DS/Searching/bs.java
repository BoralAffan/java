package com.Affan.DS.Searching;

public class bs {
    public static void main(String[] args) {
  int target=88;
  int arr[]={1,5,8,9,66,88,99,100};
  int ans=bs(arr,target);
        System.out.println(ans);
    }
//    public static int bs(int [] arr, int target){
//        int start =0;
//        int end = arr.length - 1;
//        while (start<=end){
//            int mid= start + (end - start)/2;
//              if (target<arr[mid]){
//                  end=mid -1;
//              }
//              else if(target>arr[mid]){
//                  start = mid + 1;
//              }
//              else{
//                  return mid;
//              }
//        }
//        return -1;
//    }

    static int bs(int [] arr, int target){
        if (arr.length==0){
            return -1;
        }

        int start=0;
        int end=arr.length -1;

        while (start <=end){
            int mid= start + (end - start)/2;
            if (target<arr[mid]){
                end--;
            }
            else if(target > arr[mid]){
                start ++;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
