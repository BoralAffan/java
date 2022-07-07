package com.Affan.Lists;

import java.util.Calendar;

public class Calender1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.get(Calendar.DATE));
    }
}
