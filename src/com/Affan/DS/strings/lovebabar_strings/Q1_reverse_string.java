package com.Affan.DS.strings.lovebabar_strings;

public class Q1_reverse_string {
    public static void main(String[] args) {
        String str = "affan";


rev(str);
    }

    static void rev(String str){
    char start = str.charAt(0);
    char end = str.charAt(str.length() -1);

    while (start < end){
        char temp = start;
        start = end;
        end = temp;

        start++;
        end--;
    }

        for (int i = 0; i < str.length() ;i++) {
            System.out.println(str.charAt(i));
        }
    }
}
