package com.Affan.LeetCodes;
/* binary search practise question

floor => smallest number which is greater than or equals to target

  eg int [] arr ={10,12,13,16,19,20,33,66};
  target = 30 then ans will be 20
 */
public class pracQues_floor {
    public static void main(String[] args) {

        int [] arr ={2,3,5,9,14,16,19};
        int [] arr1 ={2,3,5,9,14,16,19,22,33,44,67,99};
        int target = 4;
        int ans = floor(arr,target);
        System.out.println(ans);
//        int ans1=floor1(arr1,target);
//        System.out.println(ans1);
    }
    static int floor(int [] arr, int target){
        int start =0;
        int end = arr.length - 1;
        while (start <= end){
            // int mid = (start + end)/2;
            int mid = start + (end - start) / 2;   // it is same as (start + end)/ 2

            if (target < arr[mid]){ //if true search in left
                end = mid - 1;
            }
            else  if (target > arr[mid]){ // if true search in right
                start = mid + 1;
            }
            else {
                return mid;  // ans found
            }

        }
        return end;
    }

    static int floor1(int []arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start )/2;
            if (target<arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}

