package com.company;
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        System.out.printf("%s\n",st);  //"as we use to print in c language
        int a = 6;
        float b= 49.55f;
        System.out.printf("The value of a is %d and value of b is %.3f",a,b);
    }
}
