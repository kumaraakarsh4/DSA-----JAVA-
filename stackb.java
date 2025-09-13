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