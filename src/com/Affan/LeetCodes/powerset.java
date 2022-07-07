package com.Affan.LeetCodes;

import java.util.Scanner;

public class powerset {

// power set does not include null or empty string in its answer
    // while in subsequence it includes empty string in answer
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string : \t");
        String s=sc.nextLine();

        helper(s,0,"");

    }
    static void helper(String s, int index, String partialAns){
        if(s.length()==index){
            System.out.print(partialAns+ " ");
            return;
        }
        //take condition
        helper(s,index+1,partialAns+s.charAt(index));
        //not take
        helper(s,index+1,partialAns);
    }

}
