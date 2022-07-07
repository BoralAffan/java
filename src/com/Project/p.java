package com.Project;

import com.currencyConverter.MainWindow;

import javax.swing.*;
import java.awt.*;

public class p extends JFrame {
    private JPanel panel1;

    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon("login_page.png");

        JLabel label = new JLabel();
        label.setText("Enter your name");
        label.setIcon(imageIcon);

        JLabel label1 = new JLabel();
        label.setText("Enter your  age");
        label.setIcon(imageIcon);


         JFrame frame = new JFrame("Menu");
         frame.setTitle("Home Page");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setResizable(false);
         frame.setSize(420,420);
         frame.setVisible(true);
        // frame.getContentPane().setBackground(Color.cyan);
         frame.add(label);
         frame.add(label1);


         JPanel jPanel = new JPanel();
         jPanel.add(label1);

        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(label);

        JButton jButton = new JButton();
        jButton.isDefaultButton();

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
