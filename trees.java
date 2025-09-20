import java.util.*;
public class trees {
    public static class Node{
        int val; // intial value is on zero
        Node left; // initial value is null
        Node right; // intial value is null
    }
    public static void main(String[] args) {
        Node root = new Node();
        root.val = 10;
        System.out.println(root.val);
        System.out.println(root.left);
        System.out.println(root.right);

    }
    
}
