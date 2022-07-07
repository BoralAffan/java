package com.company;
import java.io.*;

public class buffer_class {


    public static void main(String[] args)
                    throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number: ");
        int a= Integer.parseInt(br.readLine());
        System.out.println("enter a double nuber: ");
        double c=Double.parseDouble(br.readLine());
        System.out.println("name :");
        String b= br.readLine();
        System.out.println("you entered :" +b);
        System.out.println("yo num: "+a);
        System.out.println("double "+c);
    }
}
