package com.company;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE:");
        int age = sc.nextInt();
            if (age > 18) {
               System.out.println("ADULT");
              }
             else {
                 System.out.println("not an adult");
               }
        }
    }