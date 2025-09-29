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

// import java.util.*;
// public class Heaps {

//     static class Heap{
//         ArrayList<Integer> arr = new ArrayList<>();
//         public void add(int data){
//             arr.add(data);
//             int x = arr.size()-1;
//             int par = (x-1)/2;
//             while (x> 0  && arr.get(x) > arr.get(par)) {
//                 int temp = arr.get(x);
//                 arr.set(x,arr.get(par));
//                 arr.set(par ,temp);
//                 x = par;
//                 par = (x-1)/2;
                
//             }
//         }
//         public int peek(){
//             return arr.get(0);
//         }
//         public int remove(){
//             if(arr.size()==0) return -1;
//             int data = arr.get(0); //
//             arr.set(0, arr.get(arr.size()-1));
          
//             // for removing index
//             arr.remove(arr.size()-1);
//             heapify(0);
//             return data;



//         }
//         public void heapify(int i){
//             int left = 2*i+1;
//             int right = 2*i+2;
//             int mindix = i;
//             if (left < arr.size() && arr.get(left )  >  arr.get(mindix)  ) {
//                 mindix = left;
                
//             }
//             if (right < arr.size() &&  arr.get(right) > arr.get(mindix)  ) {
//                 mindix = right;
                
//             }
//             if (mindix != i) {
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(mindix));
//                 arr.set(mindix, temp);
//                 heapify(mindix);
                
//             }
//         }
//         public boolean isEmpty(){
//             return arr.size() == 0;
//         }
//     }
  
//     public static void main(String[] args) {
//        Heap h = new Heap();
//        h.add(3);
//        h.add(4);
//        h.add(1);
//        h.add(5);
//        while (!h.isEmpty()) {
//         System.out.println(h.peek());
//         h.remove();
        
//        }
    
       
      
//     }
// }
//  NEXT HEAP SORT QUESTION

// import java.util.*;
// public class Heaps {
//     public static void heapsort(int arr[]){
//         int n = arr.length;
//         for(int i=n/2;i>=0;i--){
//             heapify(arr,i,n);
//         }
//         for(int i=n-1;i>0;i--){
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;
//             heapify(arr,0,i);
//         }
//     }
//     public static void heapify(int arr [] , int i, int size){
//          int left = 2*i+1;
//             int right = 2*i+2;
//             int maxdix = i;
//             if (left < size && arr[left ]  >  arr[maxdix] ) {
//                 maxdix = left;
                
//             }
//             if (right <size &&  arr[right] > arr[maxdix]  ) {
//                maxdix = right;
                
//             }
//             if (maxdix != i) {
//                 int temp = arr[i];
//            arr[i] =  arr[maxdix];
//                arr[maxdix] = temp;
//         heapify( arr  , maxdix, size);
        
//     }
// }

//     public static void main(String[] args) {
//         int arr [] = {1,2,4,5,3};
//         heapsort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }

//  NEXT HEAP SORT IN DESCENDING ORDEER

// import java.util.*;
// public class Heaps {
//     public static void heapsort(int arr[]){
//         int n = arr.length;
//         for(int i=n/2;i>=0;i--){
//             heapify(arr,i,n);
//         }
//         for(int i=n-1;i>0;i--){
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;
//             heapify(arr,0,i);
//         }
//     }
//     public static void heapify(int arr [] , int i, int size){
//          int left = 2*i+1;
//             int right = 2*i+2;
//             int maxdix = i;
//             if (left < size && arr[left ]  < arr[maxdix] ) {
//                 maxdix = left;
                
//             }
//             if (right <size &&  arr[right] < arr[maxdix]  ) {
//                maxdix = right;
                
//             }
//             if (maxdix != i) {
//                 int temp = arr[i];
//            arr[i] =  arr[maxdix];
//                arr[maxdix] = temp;
//         heapify( arr  , maxdix, size);
        
//     }
// }

//     public static void main(String[] args) {
//         int arr [] = {1,2,4,5,3};
//         heapsort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }

// NEARBY CARS QUESTION

// import java.util.*;
// public class Heaps {
//      static class point implements Comparable<point>{
//         int x;
//         int y;
//         int dissq;
//         int indx;
//         public point(int x ,int y , int dissq , int indx){
//             this.x = x;
//             this.y = y;
//             this.dissq = dissq;
//             this.indx = indx;
//         }
//         @Override
//         public int compareTo(point p2){
//             return this.dissq- p2.dissq;
//         }

//      }

//     public static void main(String[] args) {
//         int arr [][] = {{3,3} , {5,-1} , {-2,4}};
//         int k =2;
//         PriorityQueue<point> pq = new PriorityQueue<>();
//         for(int i=0;i<arr.length;i++){
//             int dissq = arr[i][0] * arr[i][0] + arr[i][1]* arr[i][1];
//             pq.add(new point(arr[i][0], arr[i][1],dissq ,  i));
//         }
//         for(int i=0;i<k;i++){
//             System.out.println("c" + pq.remove().indx);
//         }

//     }
// }

//  CONNCECT N ROPES QUESTION

// import java.util.*;
// public class Heaps {

//     public static void main(String[] args) {
//         int ropes[] ={2,3,5,4,9,6};
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i=0;i<ropes.length;i++){
//             pq.add(ropes[i]);
//         }
//         int cost =0;
//         while (pq.size()  > 1) {
//             int min = pq.remove();
//             int min2 = pq.remove();
//             cost+= min+min2;
//             pq.add(min+min2);
            
//         }
//         System.out.println("My cost connecting ropes is equal to :- " + cost);
//     }
// }

// WEAKEST SOLDIER QUESTION

import java.util.*;
public class Heaps {
    static class Row implements Comparable<Row>{
        int Soldier;
        int indx;
        public Row(int Soldier , int indx){
            this.Soldier = Soldier;
            this.indx = indx;
        }
        @Override 
        public int compareTo(Row r2){
            if (this.Soldier== r2.Soldier) {
                return this.indx - r2.indx;
                
            }else{
                return this.Soldier - r2.Soldier;
            }
        }
    }

    public static void main(String[] args) {
        int army [][] = {{1,0,0,0},
        {1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k =2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count =0;
            for(int j=0;j<army[0].length;j++){
                count += army[i][j] ==1 ? 1:0;
            }
            pq.add(new Row(count, i));
        }
        for(int i=0;i<k;i++){
            System.out.println("R" + pq.remove().indx);
        }
    }
}