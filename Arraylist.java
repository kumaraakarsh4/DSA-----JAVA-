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

SORTIN AN ARRAY LIST ASCENDING ORDER

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
       Collections.sort(list);
        System.out.println(list);
    }
}

 SORTING AN ARRAY LIST IN DECENDING ORDER

import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);
    }
}

 SOLVING QUESTION OF CONTAINER WITH MOST WATER

import java.util.ArrayList;

public class Arraylist {
    public static int mostWater(ArrayList<Integer> height){
        int maxWater =0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currwater = ht * width;
                maxWater = Math.max(maxWater, currwater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
         height.add(6);
          height.add(2);
           height.add(5);
            height.add(4);
             height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(mostWater(height));
    }
}

 NEXT QUESTION FINDING PAIR SUM OF ARRAY

import java.util.ArrayList;

public class Arraylist {
    public static boolean paiSum(ArrayList<Integer> list , int target ){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if (list.get(i) + list.get(j) == target) {
                    return true;
                    
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target =50;
        System.out.println(paiSum(list, target));

    }
}