package com.Affan.Recursion;

import java.util.Scanner;

public class palindrome {

    static boolean isPalindrome(int start, int end, String s){
        if(start>=end) return true;
        else if(s.charAt(start)!=s.charAt(end)) return false;
        return isPalindrome(start+1,end -1,s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s=sc.nextLine();

        System.out.println(isPalindrome(0,s.length() -1,s));

    }
}



//public class Solution {
//    static boolean isPalindromeHelper(int l,int r,String s)
//    {
//        if(l>=r) return true;
//        if(s.charAt(l)!=s.charAt(r)) return false;
//        return isPalindromeHelper(l+1,r-1,s);
//
//    }
//    public static Boolean isPalindrome(String s) {
//        return isPalindromeHelper(0,s.length(),s);
//    }
//
//}
