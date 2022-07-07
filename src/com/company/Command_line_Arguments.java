package com.company;

public class Command_line_Arguments {
    public static void main(String[] args) {
        //  System.out.println("Your First Program is "+args[].class);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}