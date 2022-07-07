package com.Affan.Lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(4);
        l.add(1);
        l.add(3);
        l.add(6);
        System.out.println(l);

        l.remove(3);
        System.out.println(l);

         l.add(0,1);
        System.out.println(l);
        System.out.println(l.get(2));

        ArrayList l1 = new ArrayList(3);
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l.add(2,4);
        l1.add(1);
        l.add(4);

        System.out.println(l1);

    }
}
