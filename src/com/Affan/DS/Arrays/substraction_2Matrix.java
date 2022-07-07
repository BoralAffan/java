package com.Affan.DS.Arrays;

import java.util.Scanner;

public class substraction_2Matrix {
    public static void main(String[] args) {
        int noOfrows;
        int noOfcols;




        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no or Rows");
        noOfrows=sc.nextInt();

        System.out.println("Enter no or Cols");
        noOfcols=sc.nextInt();


        int [][] matrix1= new int[noOfrows][noOfcols];
        int [][] matrix2= new int[noOfrows][noOfcols];
        int [][] result_matrix= new int[noOfrows][noOfcols];


        System.out.println("Enter elements of first matrix :");
        for (int i = 0; i < noOfrows; i++) {
            for (int j = 0; j < noOfcols; j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix :");
        for (int i = 0; i < noOfrows; i++) {
            for (int j = 0; j < noOfcols; j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }

        System.out.println("element of 1st matrix is :");
        for (int i = 0; i < noOfrows; i++) {
            for (int j = 0; j < noOfcols; j++) {
                System.out.print(matrix1[i][j] + "->");
            }
        }
        System.out.println();

        System.out.println("element of 2nd matrix is :");
        for (int i = 0; i < noOfrows; i++) {
            for (int j = 0; j < noOfcols; j++) {
                System.out.print(matrix2[i][j] + "->");
            }
        }
        System.out.println();


        for (int i = 0; i < noOfrows; i++) {
            for (int j = 0; j < noOfcols; j++) {
                result_matrix[i][j]=matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("result matrix is :");
        for (int row = 0; row < result_matrix.length; row++) {
            for (int col = 0; col < result_matrix[row].length; col++) {
                System.out.print(result_matrix[row][col] + "->");
            }
        }

    }
}
