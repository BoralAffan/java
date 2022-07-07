package com.company;

import java.util.Scanner;

public class Array_prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[]=new String[4];
        for (int i=0;i<4;i++){
            name[i]=sc.nextLine();
        }
        for (int i=0;i<4;i++){
            System.out.println(name[i]);
        }
    }
}
