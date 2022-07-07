package com.company;
//import java.util.io.*;
public class pattern_using_fuction {
    static void pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
                }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(12);


    }

}

