package com.company;

public class rghtangltrianglePattern {
    public static void main(String[] args) {
        int n = 14;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}