// import java.util.*;
// public class trees {
//     public static class Node{
//         int val; // intial value is on zero
//         Node left; // initial value is null
//         Node right; // intial value is null
//     }
//     public static void main(String[] args) {
//         Node root = new Node();
//         root.val = 10;
//        root.left = new Node();
//        root.left.val = 1;
//        root.right = new Node();
//        root.right.val = 2;
//         System.out.println(root.val);
//         System.out.println(root.left.val);
//         System.out.println(root.right.val);

//     }
    
// }
 
// IMPLEMENTATION OF TREE OR DISPLAY OF TREE

// import java.util.*;
// public class trees {
//     public static class Node{
//         int val;
//         Node left = null;
//         Node right = null;
//         public Node(int val){
//             this.val = val;

//         }
//     }
//     public static void display(Node root){
//         if (root == null) {
//             return;
            
//         }
//         System.out.print(root.val + "-> " );
//         if(root.left != null){
//              System.out.print(root.left.val + "  ");
//         }else{
//             System.out.print("null" + " ");
//         }
//         if(root.right != null){
//             System.out.print(root.right.val + " ");
//         } else{
//             System.out.print("null" + " ");
//         }
//         System.out.println();
//         display(root.left);
//         display(root.right);

//     }

//     public static void main(String[] args) {
//         Node root = new Node(2);
//         Node a = new Node(4);
//         Node b = new Node(10);
//         root.left = a;
//         root.right = b;
//         Node c = new Node(6);
//         Node d = new Node(5);
//         a.left = c;
//         a.right = d;
//         Node e = new Node(11);
//         b.right = e;
//         display(root);


        
//     }
// }

// FIND SIZE OF THE BINARY TREE
// ALSO FINDING THE SUM OF NODES OF THE TREE

// import java.util.*;
// public class trees {

//     public static class Node{
//         int val;
//         Node left;
//         Node right;
//         public  Node(int val){
//             this.val = val;

//         }
//     }
//     public static int size(Node root){
//         if (root == null) {
//             return 0; 
            
//         }
//         return 1 + size(root.left) + size(root.right) ;
//     }
//     public static int sum(Node root){
//         if (root == null) {
//             return 0;
            
//         }
//         return root.val + sum(root.left) + sum(root.right);
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         Node a = new Node(2);
//         Node b = new Node(3);
//         root.left = a;
//         root.right = b;
//         Node c = new Node(4);
//         Node d = new Node(5);
//         a.left = c ;
//         a.right = d;
//         Node e = new Node(6);
//         Node f = new Node(7);
//         b.left = e;
//         b.right = f;
//         System.out.println(size(root));
//         System.out.println(sum(root));
//     }
// }

// FINDING THE MAXIMUM VALUE OF TREE

// import java.util.*;
// public class trees {

//     public static class Node{
//         int val;
//         Node left;
//         Node right;
//         public  Node(int val){
//             this.val = val;

//         }
//     }
//     public static int max(Node root){
//         if (root == null) {
//             return 0;
            
//         }
//         int a = root.val;
//         int b= max(root.left);
//         int c = max(root.right);
//         return Math.max(a, Math.max(b, c));
//     }
//     public static int height(Node root){
//         if (root == null) {
//             return 0;
            
//         }
//         if (root.left == null && root.right == null) {
//             return 0;
            
//         }
//         return 1 + Math.max(height(root.left), height(root.right));
//     }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         Node a = new Node(2);
//         Node b = new Node(3);
//         root.left = a;
//         root.right = b;
//         Node c = new Node(4);
//         Node d = new Node(5);
//         a.left = c ;
//         a.right = d;
//         Node e = new Node(6);
//         Node f = new Node(7);
//         b.left = e;
//         b.right = f;
//         System.out.println(max(root));
//         System.out.println(height(root));
        
//     }
// }

// PRINTING PRE-ORDER TRAVERSAL OF TREE
import java.util.*;
public class trees {

    public class preInPost{
        public static void pip(int n){
            if (n==0)  return ;
            System.out.println("pre " + n);
            pip(n-1);
            System.out.println("in " + n);
            pip(n-1);
            System.out.println("pre " + n);
                
            
        }
    }
          public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;

        }
       
    }
    public static void preOrder(Node root){
        if (root == null) {
            return;
            
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

public static void main(String[] args) {
    Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c ;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        preOrder(root);
    
}
}