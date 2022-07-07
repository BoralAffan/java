package com.Project;

import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.util.Scanner;

public class jframe extends JFrame  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user=null;
        int count =1;
        String comp = sc.nextLine();
        JLabel label = new JLabel("hii there");
        label.setBounds(33,33,44,56);

        JFrame jf= new JFrame("Rock Paper Scissor");
         jf.setVisible(true);
         jf.add(label);
         jf.setSize(420,500);

         while (user!= comp){
             String response = JOptionPane.showInputDialog(null,
                     "Enter a guess between 1 and 100", "Guessing Game", 3);
             // user = String.parseString(response);
              user = sc.nextLine();
            // JOptionPane.showMessageDialog(null, ""+ determineGuess(user, comp, count));
             count++;
         }
    }



}
