package com.Affan.DS.Searching;

import java.util.Arrays;

public class Search_In_String {
    public static void main(String[] args) {
     String name = "Affan";
     char target = 'A';

        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str,char target) {
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
