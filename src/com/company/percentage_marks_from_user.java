package com.company;

import java.util.Scanner;

public class percentage_marks_from_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of English");
        int eng = sc.nextInt();

        System.out.println("Enter Marks of Marathi");
        int mar = sc.nextInt();

        System.out.println("Enter Marks of Hindi");
        int hin = sc.nextInt();

        System.out.println("Enter Marks of sst");
        int sst = sc.nextInt();

        System.out.println("Enter Marks of maths");
        int mat = sc.nextInt();

        int total_marks_obtained = eng+mar+hin+sst+mat;
        System.out.println("Total Marks is :"+total_marks_obtained);
        int total_marks = 500;
        float percentage =((total_marks_obtained/total_marks)*100);
        System.out.println("Your Percentage is : "+percentage);
    }
}
