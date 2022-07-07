package com.Affan.DS.LL;

public class Main {
    public static void main(String[] args) {

        linked_list ll= new linked_list();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.display();
        ll.insertLast(9);
        ll.display();
        ll.insertAtindex(22,1);
        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.deleteAtindex(1));
        ll.display();
    }
}
