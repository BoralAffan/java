package com.company;
//import java.swing.JFrame;
import javax.swing.*;

public class jframe {
    public static void main(String[] args) {
        JFrame myFrame= new JFrame();
        String myTitle= "Hii welcome to game";

        myFrame.setTitle(myTitle);
        myFrame.setSize(300,200);
        myFrame.getJMenuBar();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

}
