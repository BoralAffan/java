package com.Affan.DS;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size=0;
    }
public class Node{
     int data;
     Node next;

    public Node(int data){
        this.data=data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}

private void InsertAtFirst(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;

        if (tail == null){
            tail= head;
        }
        size+=1;
}

public void InsertAtLast(int data){
        Node node=new Node(data);
        if (tail == null){
            InsertAtFirst(data);
            return;
        }
        tail.next=node;
        tail=node;
        size++;

}

public void insert(int data, int index){
        if (index == 0){
            InsertAtFirst(data);
            return;
        }
    if (index == size) {
        InsertAtLast(data);
        return;
    }
    Node temp = head;
    for (int i = 1; i <index ; i++) {
        temp=temp.next;
    }
    Node node= new Node(data,temp.next);
    temp.next=node;
    size++;
}

public int DeleteFirst(){
        int data= head.data;
        head=head.next;
        if (head == null){
            tail= null;
        }
        size--;
        return data;
}

public int DeleteLast(){
        if (size<=1){
            return DeleteFirst();
        }
        Node secondLast = get(size - 2);
        int data = tail.data;
        tail = secondLast;
        tail.next=null;
        return data;

}

public Node get(int index){
        Node node=head;
    for (int i = 0; i < index; i++) {
        node=node.next;
    }
    return node;
}
public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
    System.out.println("END");
}

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.InsertAtFirst(1);
        linkedList.InsertAtFirst(2);
        linkedList.InsertAtFirst(3);
        linkedList.InsertAtLast(10);
        linkedList.display();
        linkedList.insert(100,2);
        linkedList.display();
        linkedList.DeleteFirst();
        linkedList.display();
        linkedList.DeleteLast();
        linkedList.display();


    }

}
