//package com.Affan.LeetCodes;
//
//public class permutation {
//    void Permute(String s,int l, int r) {
//        if (l == r) {
//            System.out.println(s);
//            return;
//        }
//        for (int i = l; i <= r; i++) {
//            s = swap(s, l, r);
//            Permute(s, l + 1, r);
//            s = swap(s, l, r);
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//    public static void swap(String s,char index1,char index2){
//        char temp=s.charAt(index1);
//        s.charAt(index1)=s.charAt(index2);
//        s.charAt(index2)=temp;
//    }
//
//}
