// import java.util.Comparator;
// import java.util.PriorityQueue;
// public class Heaps {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // it reverse the order to ascending to decending
//         pq.add(3);
//         pq.add(7);
//         pq.add(4);
//         pq.add(1);
//         pq.add(2);
//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
            
//         }
        
//     }
    
// }

import java.util.*;
public class Heaps {

    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(temp , par);
                
            }
        }
        public int peek(){
            return arr.get(0);
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(5);
        pq.add(7);
        pq.add(2);
        pq.add(0);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
            
        }
    }
}