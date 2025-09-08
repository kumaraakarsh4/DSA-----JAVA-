// PRINTING REVERSE OF AN ARRAY LIST QUESTION 
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
    }
    
}

PRINTING THE LIST OF ARRAY

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}


FIND THE MAXIMUM IN AN ARRAY LIST

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if (max < list.get(i)) {
                max = list.get(i);
                
            }
        }
        System.out.println("Maximum element is = " + max);

    }
}

NEXT QUESTION SWAP TWO  NUMBERS IN ARRAYLIST

import java.util.ArrayList;

public class Arraylist {
    public static void swap(ArrayList<Integer> list , int idx1 , int idx2){
        int temp = list.get(idx1); // we store index 1 value in temp
        list.set(idx1, list.get(idx2)); // we set index 3 value in index 1
        list.set(idx2 , temp); // then we store index 2 value in temp

    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        int idx1 = 1 , idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println(list);

    }
}