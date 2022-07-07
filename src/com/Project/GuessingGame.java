package com.Project;
import javax.swing.*;
public class GuessingGame {
    public static void main(String[] args) {
        int CompNum = (int)(Math.random()*100+1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " +  CompNum);
        int count = 1;

        while (userAnswer != CompNum)
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, CompNum, count));
            count++;
        }
    }

    public static String determineGuess(int userAnswer, int CompNum, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer ==  CompNum ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > CompNum) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < CompNum) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}

