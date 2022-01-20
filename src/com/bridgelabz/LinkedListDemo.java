package com.bridgelabz;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    //Parameterized Constructor to initialize Data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    //Adding Node to LinkedList
    /* 1. Allocate the Node from starting  &
           2. Put in the data
           3. Set next as null */
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        //Linked List is Empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void showList() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    /* 1. Allocate the Node from last &
           2. Put in the data
           3. Set next as null */

    //Insert Data from Last
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
}

    public class LinkedListDemo {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            LinkedList linkedList = new LinkedList();
            int choice;
            do {
                System.out.println("\n 1.Insert Data from Start \n 2.Insert Data from last \n 3.Show Linked List \n 4.Quit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the number");
                        int firstnumber = sc.nextInt();
                        linkedList.insertFirst(firstnumber);
                        break;
                    case 2:
                        System.out.println("Enter the number");
                        int lastnumber = sc.nextInt();
                        linkedList.insertLast(lastnumber);
                        break;
                    case 3:
                        linkedList.showList();
                        break;
                    case 4:
                        System.out.println("Thank you");
                        break;
                }
            } while (choice != 4);

        }
    }



