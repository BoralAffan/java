package com.Affan.Recursion;

public class sum_of_n_numbers {
    public static void printSum(int i, int n, int sum){
        if (i == n){
            sum=sum +i;
            System.out.println(sum);
            return;
        }
        System.out.println(i + " " +sum);
        sum=sum +i;
        printSum(i+1, n, sum);

    }

    public static void main(String[] args) {
        printSum(1,5,0);
    }
}
