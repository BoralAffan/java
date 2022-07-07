package com.Affan.ExceptionHandling;

import java.util.ArrayList;

public class genere {
    public static void main(String[] args) {
        ArrayList<Float> list = new ArrayList<>();
        list.add(4.44f);
        list.add(5.44f);
        list.add(6.44f);
        list.add(7.44f);

        System.out.println(list);

        list.addAll(list);
//        System.out.println(ad);

    }
}
