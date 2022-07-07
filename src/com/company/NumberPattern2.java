package com.company;
import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        int i,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Limit: ");
        num = sc.nextInt();

        stop :
        {
            nextNum:
            for (i=1;i<=num;i++)
            {
              if (i==num+1)
                  break stop;
              if (i==5)
                  continue nextNum;
                System.out.print(" "+i+"");
            }
        }
    }
}
