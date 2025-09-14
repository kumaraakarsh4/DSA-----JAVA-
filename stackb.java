import java.util.ArrayList;
public class stackb {

    static class Stack{
       static ArrayList<Integer> list = new ArrayList<>();
       public static boolean isEmpty(){
        return list.size() == 0;
       }
       
       // PUSH 
       public static void push(int data){
        list.add(data);
       }

       // POP 

       public static int pop(){
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
       }

       // PEEk 

       public static int peek(){
        int top = list.get(list.size() - 1);
        return top;
       }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
}

IMPLENTING STACK WITH LINKEDLIST
import java.util.LinkedList;
public class stackb {

    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head =  null;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
               head = newNode;
                return;
                
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if (isEmpty()) {
                return -1;
                
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            return head.data;
        }
    }
    public static void main(String[] args) {
          Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        
    }
}
}

 IMPLEMENTING THE STACK WITH THE HELP OF JAVA COLLECTION FRAMEWORK

import java.util.*;
public class stackb {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
}

PUSH AT THE BOTTOM OF THE STACK

import java.util.*;
public class stackb {
    public static void pushAtBottom(Stack<Integer> s , int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
            
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s , 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
}

REVERSE A STRING USING A STACK

import java.util.*;
public class stackb {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int indx = 0;
        while (indx < str.length()) {
            s.push(str.charAt(indx));
            indx++;
            
}
       StringBuilder result = new StringBuilder("");
       while (!s.isEmpty()) {
       char curr = s.pop();
       result.append(curr);
        
       }
       return result.toString();

    }

    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
       
    }
}

 REVERSE A STACK

import java.util.*;
public class stackb {
    public static void pushAtBottom(Stack<Integer> s , int data){
        if (s.isEmpty()) {
            s.push(data);    // we made this function to push the element in the bottom
            return;
            
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
           return;                   // we call the bottom function in reverse stack
            
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());   // we print our reverse stack
            
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reverseStack(s);
        printStack(s);
        
    }
}

STOCK SPAN PROBLEM [ FLIPKART AMAZON PAYTM]

import java.util.*;
public class stackb {
    public static void stockSpan(int stocks[] , int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]= 1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {  // we remove the lower value 
                s.pop();
 }
              if (s.isEmpty()) {
                    span[i] = i+1;  // all previous lower span will remove
                    
                }else{
                    int prevhigh = s.peek();
                    span[i] = i- prevhigh;   // it is showing distance from last greater price
                }
            s.push(i);
        }
        
    }

    public static void main(String[] args) {
        int stocks[] = {100 , 80,60,70,60,85,100};
        int span[] = new int[stocks.length];

        stockSpan(stocks , span);

        for(int i = 0;i<span.length;i++){
            System.out.println(span[i] + " ");
        }

    }
}

 PRINTING THE NEXT GREATER ELEMENT 
import java.util.*;
public class stackb {

    public static void main(String[] args) {
        int arr[] = {4,7,0,1,2};
        Stack<Integer> s = new Stack<>();
        int nexGreater[] = new int[arr.length];
        for(int i=arr.length-1; i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
                
            }
            if (s.isEmpty()) {
                nexGreater[i] = -1;
                
            }else{
                nexGreater[i] = arr[s.peek()];
            }
             s.push(i);
        } 
        for(int i =0;i<arr.length;i++){
        System.out.print(nexGreater[i] + " ");
     }
     System.out.println();

}
     
}

CHECKING VALID PARENTHESIS EXIST OR NOT QUESTION

import java.util.*;
public class stackb {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {  // for opening bracket
                s.push(ch);
                
            }else{  // for closing bracket
                if (s.isEmpty()) {
                    return false;
                    
                }
                if ((s.peek() == '(' && ch == ')')|| (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch==']')){
                s.pop();
                    
                }else{
                    return false;
                
            
            }
        }
    }
    if (s.isEmpty()) {
        return true;
        
    }else{
        return false;
    }
    }
    

    public static void main(String[] args) {
        String str = "({}[])";  // it should return true
        System.out.println(isValid(str));
    }
}

NEXT QUESTION OF VALID PARENTHESIS

import java.util.*;
public class stackb {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {  // for opening bracket
                s.push(ch);
                
            }else{  // for closing bracket
                if (s.isEmpty()) {
                    return false;
                    
                }
                if ((s.peek() == '(' && ch == ')')|| (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch==']')){
                s.pop();
                    
                }else{
                    return false;
                
            
            }
        }
    }
    if (s.isEmpty()) {
        return true;
        
    }else{
        return false;
    }
    }
    

    public static void main(String[] args) {
        String str = "{}([)";  // it should return FALSE
        System.out.println(isValid(str));
    }
}

REMOVING DUPLICATE PARENTHESIS 

import java.util.*;
public class stackb {
public static boolean isDuplicate(String str){
    Stack<Character> s = new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if (ch == ')') {
            int count =0;
            while (s.peek() != '(') {
                s.pop();
                count++;
             }
             if (count < 1) {
                return true;
                
             }else{
                s.pop();
             }
            }else{
                s.push(ch);
             }
            
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; // it return true
        String str2 = "(a+b)"; // it return false
        System.out.println(isDuplicate(str2));

    }
}