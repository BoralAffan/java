package com.Affan.Lists.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class type {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
