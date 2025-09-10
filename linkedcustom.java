import java.util.LinkedList;

public class linkedcustom {

    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
            
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
            
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if (head == null) {
            System.out.println("LL is empty");
            return;
            
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  -> ");
            temp = temp.next;
            
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        linkedcustom ll = new linkedcustom();
        ll.print();
        
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

    }

}

NEXT QUESTION LINKEDLIST OF ADDING IN THE MIDDLE

import java.util.LinkedList;

public class linkedcustom {

    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
            
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
            
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if (head == null) {
            System.out.println("LL is empty");
            return;
            
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  -> ");
            temp = temp.next;
            
        }
        System.out.println("null");
    }
    public void add(int idx , int data){
        if (idx == 0) {
            addFirst(data);
            return;
            
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;
        while (i< idx-1) {
            temp = temp.next;
            i++;
            
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        linkedcustom ll = new linkedcustom();
        
          
        
        ll.addFirst(1);
        
        ll.addFirst(2);
        
        ll.addLast(3);
        
        ll.addLast(4);
        ll.add(1, 9);
        ll.print();
      

    }

}

NEXT QUESTION REMOVE ELEMENT FROM LINKEDLIST

import java.util.LinkedList;
import java.util.*;

public class linkedcustom {

    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
            
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
            
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if (head == null) {
            System.out.println("LL is empty");
            
            return;
            
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  -> ");
            temp = temp.next;
            
        }
        System.out.println("null");
    }
    public void add(int idx , int data){
        if (idx == 0) {
            addFirst(data);
            return;
            
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while (i< idx-1) {
            temp = temp.next;
            i++;
            
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int remove(){
        if (size ==0){
            System.out.print("LL is empty");
           return Integer.MIN_VALUE ;
            
        }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
            
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public static void main(String[] args) {
        linkedcustom ll = new linkedcustom();
        
          
        
        ll.addFirst(2);
        
        ll.addFirst(1);
        
        ll.addLast(3);
        
        ll.addLast(4);
        // ll.add(1, 9);
        
        ll.print();
        ll.remove();
        ll.print();
        System.out.println(ll.size);

      

    }

}