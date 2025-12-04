package com;

public class DLL {

    private Node head;
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

   public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public void displayRev(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.print("END");

        System.out.print("print in reverse");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public void insert(int after , int val){
        Node P = find(after);

        if(P == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = P.next;
        P.next = node;
        node.prev = P;

        if(node.next != null){
            node.next.prev = node;
        }
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }
}
