package com.company;

import java.util.Scanner;

public class print_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
          switch(num){
              case 1:
                  System.out.println("JANUARY");
                  break;
              case 2:
                  System.out.println(" FEBRYARY");
                  break;
              case 3:
                  System.out.println(" MARCH");
                  break;
              case 4:
                  System.out.println(" APRIL");
                  break;
              case 5:
                  System.out.println("MAY");
                  break;
              case 6:
                  System.out.println("June");
                  break;
              case 7:
                  System.out.println("JUly ");
                  break;
              case 8:
                  System.out.println("AUGUST");
                  break;
              case 9:
                  System.out.println(" SEPTEMBER");
                  break;
              case 10:
                  System.out.println("OCTOBER");
                  break;
              case 11:
                  System.out.println(" NOVEMBER");
                  break;
              case 12:
                  System.out.println(" DECEMBER");
                  break;
              default:
                  System.out.println("invalid number");

          }


    }
}
