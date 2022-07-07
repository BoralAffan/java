package com.company;



public class Runner {
    public static void main(String[] args) {
       // LinkedList list = new LinkedList();
            LinkedList list = new LinkedList();
           list.insert(1);
           list.insert(2);
           list.insert(3);
           list.insert(4);
           list.insertAtStart(25);
           list.insertAt(0,55);
           list.deleteAt(2);

        System.out.println("Elements in LinkedList are :-");
           list.show();
    }
}
