package com.Affan.LeetCodes;
/* binary search practise question

ceiling => smallest number which is greater than or equals to target

  eg int [] arr ={10,12,13,16,19,20,33,66};
  target = 30 then ans will be 33
 */
public class pracQues_ceiling {
    public static void main(String[] args) {
      int [] arr ={2,3,5,9,14,16,19};
      int target = 4;
      int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    // returns the index of smallest no which is greater than or equals to target
    static int ceiling(int [] arr, int target){


        /*if the target is greatest than the elements present in array it will return -1
      int [] arr ={2,3,5,9,14,16,19};
      int target = 99;
        99 se smaller hai sab array me isiye -1 retuen karega
         */

        if (target > arr[arr.length - 1]){
            return -1;
        }
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
        return start;

    }
}

