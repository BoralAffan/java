package com.company;

import java.io.File;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        File file = new File("noname.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create file");
            e.printStackTrace();
        }
    }
}
