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
// import java.util.*;
// public class trees {

//     public class preInPost{
//         public static void pip(int n){
//             if (n==0)  return ;
//             System.out.println("pre " + n);
//             pip(n-1);
//             System.out.println("in " + n);
//             pip(n-1);
//             System.out.println("pre " + n);
                
            
//         }
//     }
//           public static class Node{
//         int val;
//         Node left;
//         Node right;
//         public  Node(int val){
//             this.val = val;

//         }
       
//     }
//     public static void preOrder(Node root){
//         if (root == null) {
//             return;
            
//         }
//         System.out.println(root.val);
//         preOrder(root.left);
//         preOrder(root.right);
//     }

// public static void main(String[] args) {
//     Node root = new Node(1);
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
//         preOrder(root);
    
// }
// }

// INORDER TRAVERSAL OF BINARY TREE
// import java.util.*;
// public class trees {

//     public class preInPost{
//         public static void pip(int n){
//             if (n==0)  return ;
//             System.out.println("pre " + n);
//             pip(n-1);
//             System.out.println("in " + n);
//             pip(n-1);
//             System.out.println("pre " + n);
                
            
//         }
//     }
//           public static class Node{
//         int val;
//         Node left;
//         Node right;
//         public  Node(int val){
//             this.val = val;

//         }
       
//     }
//     public static void inOrder(Node root){
//         if (root == null) {
//             return;
            
//         }
       
//         inOrder(root.left);
//          System.out.println(root.val);
//         inOrder(root.right);
//     }

// public static void main(String[] args) {
//     Node root = new Node(1);
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
//         inOrder(root);
    
// }
// }

// POST ORDER TRAVERSAL IN TREE
// import java.util.*;
// public class trees {

//     public class preInPost{
//         public static void pip(int n){
//             if (n==0)  return ;
//             System.out.println("pre " + n);
//             pip(n-1);
//             System.out.println("in " + n);
//             pip(n-1);
//             System.out.println("pre " + n);
                
            
//         }
//     }
//           public static class Node{
//         int val;
//         Node left;
//         Node right;
//         public  Node(int val){
//             this.val = val;

//         }
       
//     }
//     public static void postOrder(Node root){
//         if (root == null) {
//             return;
            
//         }
       
//         postOrder(root.left);
        
//         postOrder(root.right);
//          System.out.println(root.val);
//     }

// public static void main(String[] args) {
//     Node root = new Node(1);
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
//         postOrder(root);
    
// }
// }

// PRINTING NTH LEVEL ELEMENT
// import java.util.*;
// public class trees {

//     public class preInPost{
//         public static void pip(int n){
//             if (n==0)  return ;
//             System.out.println("pre " + n);
//             pip(n-1);
//             System.out.println("in " + n);
//             pip(n-1);
//             System.out.println("pre " + n);
                
            
//         }
//     }
//           public static class Node{
//         int val;
//         Node left;
//         Node right;
//         public  Node(int val){
//             this.val = val;

//         }
       
//     }
//     public static void nthLevel(Node root , int n){
//       if (root == null){
//         return;
//       }
//       if (n==1){
//          System.out.print(root.val + " ");
//          return;
//       } 
      
//       nthLevel(root.left, n-1);
//       nthLevel(root.right, n-1);
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

// public static void main(String[] args) {
//     Node root = new Node(1);
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
//         int level = height(root) + 1;
//       for(int i=1;i<=level;i++){
//        nthLevel(root, i);
//        System.out.println();

//       }
    
// }
// }

// BFS [BREATH FIRST SEARCH] LEVEL ORDER TRAVERSAL

// import java.util.*;
// public class trees {

  
//           public static class Node{
//         int val;
//         Node left;
//         Node right;
//         public  Node(int val){
//             this.val = val;

//         }
       
//     }
//     public static void bfs(Node root){
//         Queue<Node> q = new LinkedList<>();
//         if(root!= null) q.add(root);
//         while (q.size()>0) {
//             Node temp = q.peek();
//             if(temp.left != null) q.add(temp.left);
//             if(temp.right != null) q.add(temp.right);
//             System.out.print(temp.val + " ");
//             q.remove();
            
//         }

//     }
   
// public static void main(String[] args) {
//     Node root = new Node(1);
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
//         bfs(root);
       
    
// }
// }

// BFS NEXT QUESTION

// import java.util.*;
// public class trees {

  
//           public static class Node{
//         int val;
//         Node left;
//         Node right;
//         public  Node(int val){
//             this.val = val;

//         }
       
//     }
//     public static void bfs(Node root){
//         Queue<Node> q = new LinkedList<>();
//         if(root!= null) q.add(root);
//         while (q.size()>0) {
//             Node temp = q.peek();
//             if(temp.left != null) q.add(temp.left);
//             if(temp.right != null) q.add(temp.right);
//             System.out.print(temp.val + " ");
//             q.remove();
            
//         }

//     }
   
// public static void main(String[] args) {
//     Node root = new Node(1);
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
//         bfs(root);
       
    
// }
// }

// import java.util.*;
// public class trees {

  
//           public static class Node{
//         int val;
//         Node left;
//         Node right;
//         public  Node(int val){
//             this.val = val;

//         }
       
//     }
//     public static int height(Node root){
//         if(root == null || root.left == null && root.right==null) return 0;
//         return 1 + Math.max(height(root.left), height(root.right));
//     }
//     public static boolean balanceTree(Node root){
//         if(root == null) return true;
//         int lh = height(root.left);
//         int rh = height(root.right);
//         int d = lh - rh;
//         if(d<0) d = -d;
//         if(d<1) return false;
//         return (balanceTree(root.left) && balanceTree(root.right));
//     }

//     public static void main(String[] args) {
//     Node root = new Node(3);
//         Node a = new Node(9);
//         Node b = new Node(20);
//         root.left = a;
//         root.right = b;
       
//         Node e = new Node(15);
//         Node f = new Node(7);
//         b.left = e;
//         b.right = f;
//         height(root);
//        System.out.println(balanceTree(root));
// }
// }

//NEXT QUESTION CHECKING BALANCED TREE

import java.util.*;
public class trees {

  
          public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;

        }
       
    }
    public static int height(Node root){
        if(root == null || root.left == null && root.right==null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static boolean balanceTree(Node root){
        if(root == null) return true;
        int lh = height(root.left);
        if (root.left!=null) {
            lh++;
            
        }
        int rh = height(root.right);
        if (root.right!=null) {
           rh++; 
        }
        int d = lh - rh;
        if(d<0) d = -d;
        if(d<1) return false;
        return (balanceTree(root.left) && balanceTree(root.right));
    }

    public static void main(String[] args) {
    Node root = new Node(3);
        Node a = new Node(9);
        Node b = new Node(20);
        root.left = a;
        root.right = b;
       
        Node e = new Node(15);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        height(root);
       System.out.println(balanceTree(root));
}
}