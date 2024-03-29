package com.Affan.LeetCodes;

public class Q744_LeetCode {
    public static void main(String[] args) {
        char [] letters ={'a','b','r','g'};
        char target ='c';
        int ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters,char target){
        int start =0;
        int end = letters.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target<letters[mid]){
                end =mid - 1;
            }
            else {
                start = mid +1;
            }


        }
        return letters[start % letters.length] ;
    }
}
