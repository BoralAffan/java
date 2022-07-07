package com.Affan.DS.Arrays;
//   -->    https://practice.geeksforgeeks.org/problems/reverse-a-string/1
public class Q2_array {
//    public static void main(String[] args) {
//
//
//    }
//    static int reverseWord(int [] str){
//
//        if (str.length==0){
//            return 0;
//        }
//     int start=0;
//        int end=str.length -1;
//        while (start<end){
//            swap(str,start,end);
//            start++;
//            end--;
//        }
//        return 0;
//    }
//
//    static void swap(int [] str,int index1,int index2){
//        int temp = str[index1];
//        str[index1]=str[index2];
//        str[index2]=temp;


//    }
public static void main(String[] args) {
    String str="hiiiklj",nstr="";
    char ch;

    for (int i = 0; i < str.length(); i++) {
        ch=str.charAt(i);
        nstr=ch+nstr;
    }
    System.out.println(nstr);
    reverseWord(str);
}
public static String reverseWord(String str)
{
    // Reverse the string str
    String nstr="";
    char ch;

    for (int i = 0; i < str.length(); i++) {
        ch=str.charAt(i);
        nstr=ch+nstr;
    }
    System.out.println(nstr);
    return nstr;
}
}
