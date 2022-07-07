package com.company;

import java.util.Scanner;

public class conditional_switchcase_ps3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte m1, m2, m3;
        System.out.println("Enter marks of English ");
        m1 = sc.nextByte();
        System.out.println("Enter marks of maths ");
        m2 = sc.nextByte();
        System.out.println("Enter marks of science  ");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m2) / 3.0f;
        System.out.println("Your Over all Percentage is " + avg);
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations!!!! You have been promoted ");
        } else {
            System.out.println("better luck next time ");
        }
    }
}
