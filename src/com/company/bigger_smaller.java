package com.company;

import java.util.Scanner;

public class bigger_smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("ENTER A");
//        int a = sc.nextInt();
//        System.out.println("ENTER B");
//        int b = sc.nextInt();
//          if (a==b) {
//              System.out.println("equal");
//          }
//          else if (a>b){
//              System.out.println("A is greater");
//          }
//           else {
//              System.out.println("A is smaller");
//          }

        int button = sc.nextInt();
        switch (button){
            case 1:
                System.out.println("HELLO");
                break;
            case 2:
                System.out.println("NAMSTEE");
                break;
            case 3:
                System.out.println("BONJOUR");
                break;
            default :
                System.out.println("INVALID BUTTON");
        }

    }
}

