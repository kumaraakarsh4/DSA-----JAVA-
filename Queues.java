// public class Queues {
//     public static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }
//         public static boolean isEmpty(){
//             return rear == -1;
//         }
//         public static void Add(int data){
//             if (rear == size-1) {
//                 System.out.println("Queue is full");
//                 return;
                
//             }
//             rear =  rear +1;
//             arr[rear] = data;
//         }

//         public static int remove(){
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
                
//             }
//             int front = arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i] = arr[i+1];
//             }
//             rear = rear -1;
//             return front;
//         }
//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
                
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(3);
//         q.Add(1);
//         q.Add(2);
//         q.Add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
            
//         }
//     }
    
// }

// Next Adding question

// public class Queues {
//     public static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }
//         public static boolean isEmpty(){
//             return rear == -1;
//         }
//         public static void Add(int data){
//             if (rear == size-1) {
//                 System.out.println("Queue is full");
//                 return;
                
//             }
//             rear =  rear +1;
//             arr[rear] = data;
//         }
//          public String toString() {
//             StringBuilder sb = new StringBuilder();
//             sb.append("[");
//             for (int i = 0; i <= rear; i++) {
//                 sb.append(arr[i]);
//                 if (i < rear) sb.append(", ");
//             }
//             sb.append("]");
//             return sb.toString();
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.Add(1);
//         q.Add(2);
//         q.Add(3);
//         q.Add(4);
//         q.Add(5);
//         System.out.println(q);
//     }
// }

// next question of circular Queue 

// public class Queues {

//     public static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;
//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear =  -1;
//             front = -1;

//         }
//         public static boolean isEmpty(){
//             return rear == -1 && front == -1;
//         }
//         public static boolean isFull(){
//             return  (rear+1)%size == front;
//         }
//         public static void add(int data){
//             if (isFull()) {
//                 System.out.println("Queue is full");
//                 return ;
                
//             }
//             // in this case we add the first element
//             if (front == -1) {
//                 front = 0;
                
//             }
//             rear = (rear+1)%size;
//             arr[rear] =  data;
//         }
//         public static int remove(){
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
                
//             }
//             int result = arr[front];
            
//             // removing the last element
//             if (rear == front) {
//                 rear = front = -1;
                
//             }else{
//                 front = (front+1)%size;

//             }
//             return result;
//         }
//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("queue is full");
//                 return -1 ;
                
//             }
//             return arr[front];

//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(3);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//       System.out.println(  q.remove());
//         q.add(4);
//        System.out.println( q.remove());
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
            
//         }

//     }
// }

//next question queue using linkedlist

public class Queues {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
         public static boolean isEmpty(){
        return head == null && tail == null;
    }
    public static void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
            
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static int remove(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
            
        }
        int front = head.data;
        if (tail == head) {
            tail = head= null;
            
        }else{
            head = head.next;
        }
        return front;
    }
    public static int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
            
        }
        return head.data;
    }
}
public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
while (!q.isEmpty()) {
    System.out.println(q.peek());
    q.remove();
    
}
}

}
   



