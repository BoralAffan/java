package com.Affan.Lists;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class Date1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());


    }
}
