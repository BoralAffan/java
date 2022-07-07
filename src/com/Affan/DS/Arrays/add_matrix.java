package com.Affan.DS.Arrays;

import java.util.Scanner;

public class add_matrix {
    public static void main(String[] args) {
       int noOfrows;
       int noOfCols;

       try {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter no of rows of matrix :");
           noOfrows=sc.nextInt();
           System.out.println("Enter no of cols of matrix :");
           noOfCols=sc.nextInt();

           int [][] matrix1 = new int[noOfrows][noOfCols];
           int [][] matrix2 = new int[noOfrows][noOfCols];
           int [][] result_matrix = new int[noOfrows][noOfCols];

           System.out.println(" Enter elements of matrix 1");
           for (int i = 0; i < noOfrows ; i++) {
               for (int j = 0; j < noOfCols; j++) {
                   matrix1[i][j]=sc.nextInt();
               }
           }

           System.out.println(" Enter elements of matrix 2");
           for (int i = 0; i < noOfrows ; i++) {
               for (int j = 0; j < noOfCols; j++) {
                   matrix2[i][j]=sc.nextInt();
               }
           }

           System.out.println(" First matrix is ");
           for (int i = 0; i < noOfrows; i++) {
               for (int j = 0; j < noOfCols; j++) {
                   System.out.print(matrix1[i][j] + " ->");
               }
           }
           System.out.println();


           System.out.println(" second matrix is ");
           for (int i = 0; i < noOfrows; i++) {
               for (int j = 0; j < noOfCols; j++) {
                   System.out.print(matrix2[i][j] + " ->");
               }
           }
           System.out.println();


           for (int i = 0; i < noOfrows ; i++) {
               for (int j = 0; j <noOfCols ; j++) {
                   result_matrix[i][j]=matrix1[i][j] + matrix2[i][j];
               }
           }

           System.out.println(" result matrix is ");
           for (int i = 0; i < noOfrows; i++) {
               for (int j = 0; j < noOfCols; j++) {
                   System.out.print(result_matrix[i][j] + " ->");
               }
           }


        }
       catch (Exception e){
           e.printStackTrace();
       }
    }

}
