package com.Affan.FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TableInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter table you want to print in file: ");
        int n = sc.nextInt();

        String table="";
        for (int i = 0; i < 10; i++) {
            table+= n + "X" +(i+1) + "=" + n*(i+1);
            table+="\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("Table.txt");
            fileWriter.write(table);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
