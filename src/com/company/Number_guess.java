package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

public int getNoOfGuesses(){
    return noOfGuesses;
}
public void setNoOfGuesses(int noOfGuesses){
    this.noOfGuesses=noOfGuesses;
}
Game(){
    Random ran=new Random();
    this.number=ran.nextInt(100);
}
void takeUserInput(){
    System.out.println("Guess the number :");
    Scanner sc=new Scanner(System.in);
    inputNumber= sc.nextInt();
}
boolean isCorrectNum(){
    noOfGuesses++;
    if (inputNumber==number){
        System.out.println("Wow!!!!! you guessed it right");
        return true;
    }
    else if (inputNumber<number){
        System.out.println("Too low....guess big number");
    }
    else if (inputNumber>number){
        System.out.println("Too high...guess low number");
    }
    return false;
}
}
public class Number_guess {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while (!b){
            g.takeUserInput();
            b=g.isCorrectNum();
        }
    }
}
