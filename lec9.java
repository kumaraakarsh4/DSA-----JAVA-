// public class lec9 {
//     public static void main(String[] args) {
//         int[] Marks = new int[5];
//         Marks[0]= 97; // physcics marks
//         Marks[1]=98; // chemistry marks
//         Marks[2]=99; // math marks
//         Marks[3]=59; // English marks
//         Marks[4]=60; // Hindi marks
//         for(int i =0; i<5; i++){
//             System.out.println("Marks of all subjects :-- " + Marks[i] );
//         }
//     }
    
// }


// Adding two array question
// public class lec9 {

//     public static void main(String[] args) {
        
        
//         int[] Marks = new int[5];
//         Marks[0]= 5;
//         Marks[1]=4;
//         Marks[2]=6;
//         Marks[3]=2;
//         Marks[4]=7;
//         int target = 23;
//         if (Marks[4]+Marks[1]+Marks[2]+Marks[0] == target) {
//             System.out.println("Valid");
            
//         }
//         else{
//             System.out.println("Invalid");+
//         }

       


//     }
// }

// public class lec9 {

//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0]= 60; // Daksh English Marks
//         marks[1]= 70; // Daksh Math Marks
//         marks[2]= 55; // Daksh Science Marks
//         float Average;
//         Average = (marks[0] + marks[1]  + marks[2]) / 3 ;
//         System.out.println("Average of all number:---   " + Average);

//     }
// }

// sorting duplicate number from sorted array
// public class lec9 {

//     public static int removeElement(int[] nums, int val){
//         int k =0;
//         for(int i = 0; i<nums.length; i++){
//             if (nums[i] != val) {
//                 nums[k]= nums[i];
//                 k++;
                
//             }
//         }
//         return k ;
//     }
//     public static void main(String[] args) {
//         System.out.println(removeElement(5, 2));
//     }
// }

// passing argument in array
// public class lec9 {

//     public static void update(int marks[]){
//         for(int i = 0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String[] args) {
//         int marks[] = {96,97,98};
//         update(marks);
//         for(int i =0; i<marks.length; i++){
//             System.out.println(marks[i] + " " );
//         }
//         System.out.println();
//     }
// }

// linear search 

// public class lec9 {
//     public static int linearSearch(int numbers[], int key){
//         for(int i =0; i< numbers.length; i++){
//             if (numbers[i] == key) {
//                 return i;
                
//             }
          
//         }
//           return -1;
        
//     }

//     public static void main(String[] args) {
//         int numbers[]= {2,3,4,6,8,9,10,14,16};
//         int key = 20;
//         int index = linearSearch(numbers, key);
//         if (index == -1) {
//             System.out.println("Not Found");
            
//         }else{
//             System.out.println("The Key at index :---- " + index);
//         }
//     }
// }

// linear search using string
// public class lec9 {
//     public static int linearSearch(String menu[], String key){
//         for(int i =0; i<menu.length;i++){
//             if (menu[i].equals(key)) {
//                 return i;
                
//             }
//         }
//         return -1;

//     }

//     public static void main(String[] args) {
//         String menu[] = {"samosa", "pizza","hotdog","burger","choco"};
//         String key = "pizza";
//         int  index = linearSearch(menu, key);
//         if (index == -1 ) {
//             System.out.println("Not Found");
            
//         }else{
//             System.out.println("The key is found at index :--- " + index);
//         }
//     }
// }

// finding largest element
// import java.util.* ;
// public class lec9 {
//     public static int largestNumber(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i =0; i<numbers.length; i++){
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
                
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1,2,3,8,5,6};
//         System.out.println("The largest number is : --- " + largestNumber(numbers));
//     }
// }

// finding the smallest number
import java.util.*;
public class lec9 {
    public static int smallestNumber(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i<numbers.length; i++){
            if (smallest > numbers[i]) {
                smallest = numbers[i];
                
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[]={5,8,3,7,2};
        System.out.println("The smallest number is:-- " + smallestNumber(numbers));

    }
}