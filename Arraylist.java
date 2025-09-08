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