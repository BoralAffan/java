package com.Affan.LeetCodes;
//   https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Q1295_LeetCode {
    public static void main(String[] args){
         int [] nums ={454,5,6,7,888888,9};
        System.out.println(findNumbers(nums));
        System.out.println(digits(0));
        System.out.println(even(65477));
    }
    static int findNumbers(int[] nums) {
        int count =0;
//        for (int i = 0; i < nums.length; i++) {
//            if (even(num)){
//                count++;
//            }
//        }
        for (int num: nums){
            if (even(num)){
                count++;
            }
        }

        return count;
    }


    //to check whether the number contains even digits or not eg---> 222 contains 3 digits not an even no 3333 4 digits ehich is even no
    static boolean even(int num) {
        int No_of_digits=digits(num);
        if (No_of_digits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0){
            return  1;
        }
        int count =0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
