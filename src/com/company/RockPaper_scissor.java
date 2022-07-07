package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaper_scissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("********** Welcome to Rock paper scissor game ********\n");

           System.out.println("choose any one\n 0:Rock \n 1:Paper \n 2: Scissor");
           int user= sc.nextInt();
           System.out.println("you selected " +user);

           Random number=new Random();
           int comp= number.nextInt(3);
           System.out.println("computer selcted "+comp);


           if (user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1) {
               System.out.println("hurray!! you won");
           }

           else if (user==comp){
               System.out.println("Draw!!!!!!!!!!!!");
           }
           else {
               System.out.println("oops!! you lose better luck next time");
           }

    }
    }

