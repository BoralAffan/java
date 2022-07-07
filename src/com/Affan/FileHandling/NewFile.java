package com.Affan.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args) {
//        File f=new File("untitle.txt");         create file by the name untitle.txt
//        try {
//        f.createNewFile();
//        }catch (IOException e){
//            System.out.println("Netwoek error");
//            e.printStackTrace();
//        }

//        try {
//            FileWriter fileWriter = new FileWriter("noname.txt");
//        fileWriter.write("writing from anything from java code in anyfile\n byee");        write anything in the given file
//        fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File f=new File("untitle.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String l=sc.nextLine();
                System.out.println(l);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
