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

 QUESTION OF REMOVING LAST ELEMENT FROM LINKEDLIST

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
    public int removeLast(){
         if (size ==0){
            System.out.print("LL is empty");
           return Integer.MIN_VALUE ;
            
        }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
            
        }
        Node prev = head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
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
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

      

    }
}

QUESTION OF LINKEDLIST SEARCH FOR A KEY

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
   public int search(int key){
    Node temp = head;
    int i =0;
    while (temp != null) {
        if (temp.data == key) {
            return i;

            
        }
         temp = temp.next;
        i++;
        
    }
    return -1;
   }
    
    
    public static void main(String[] args) {
        linkedcustom ll = new linkedcustom();
        
          
        
        ll.addFirst(2);
        
        ll.addFirst(1);
        
        ll.addLast(3);
        
        ll.addLast(4);
        // ll.add(1, 9);
        
        ll.print();
    
        System.out.println("key is found at :- " + ll.search(4));
        System.out.println(ll.search(5));
        System.out.println(ll.size);

      

    }
}

NEXT QUESTION REVERSE LINKEDLIST

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
    public void reverse(){
        Node prev =  null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            
        }
        head = prev;
    }
    
   
        public static void main(String[] args) {
        linkedcustom ll = new linkedcustom();
        
          
        
        ll.addFirst(2);
        
        ll.addFirst(1);
        
        ll.addLast(3);
        
        ll.addLast(4);
        // ll.add(1, 9);
        
        ll.print();
        ll.reverse();
        ll.print();
        
      

    }
}

CHECK LINKEDLIST IS PALINDROME OR NOT 

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
    public Node fidMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }
    public boolean isPalindrome(){
        if (head == null || head.next == null) {
            return true;
            
        }
        Node miNode = fidMid(head);
        Node prev = null;
        Node curr = miNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            prev = curr;
            curr = next;
            
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
                
            }
            left = left.next;
            right = right.next;
            
        }
        return true;
    }
    public static void main(String[] args) {
         linkedcustom ll = new linkedcustom();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        // ll.addLast(1);
        ll.print();
        System.out.println(ll.isPalindrome());
        
    }
}

FYOID CYCLE ALGORTITHM LINKEDLIST

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

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
                
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
         linkedcustom ll = new linkedcustom();
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        // head.next.next.next = head;
        System.out.println(isCycle());
         
        
    }
}