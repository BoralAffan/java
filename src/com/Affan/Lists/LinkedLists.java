package com.Affan.Lists;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        list.addFirst(0);
        list.addLast(2);

        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
