// import java.util.*;
// public class Darray {
//     public static boolean search(int matrix [][] , int key){
//         for(int i =0;i<matrix.length;i++){
//             for(int j =0; j<matrix[0].length;j++){
//                 if (matrix[i][j] == key) {
//                     System.out.print("The key is at (" + i + "," + j + ")");
//                     return true;
                    
//                 }
//             }
            
//           }
//           System.out.println("Key not found");
//           return false;


//     }
//     public static void main(String[] args) {
//         int matrix [] [] = new int [3] [3];
      
//         int n = matrix.length , m = matrix[0].length;
//           Scanner sc = new Scanner(System.in);
//           for(int i =0; i<n;i++){
//             for(int j =0; j<m;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//           }
//           for(int i =0;i<n;i++){
//             for(int j =0; j<n;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//              System.out.println();
//           }
//           search(matrix, 8);
         

        
//     }
    
// }

// praticing my 2d array question
// import java.util.*;
// public class Darray {
//     public static boolean arrayDi(int matrix[][] , int key){
//         for(int i =0; i<matrix.length;i++){
//             for(int j =0; j<matrix[0].length;j++){
//                 if (matrix[i][j] == key) {
//                     System.out.print("The key is found at (" + i + "," + j  + ")" );
//                     return true;

                    
//                 }
//             }
//         }
//         System.out.println("the key is found ");
//         return false;

//     }

//     public static void main(String[] args) {
//         int matrix [][]= new int [4][3];
//         int n = matrix.length , m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0; i<n;i++){
//             for(int j =0; j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         for(int i = 0; i<n;i++){
//             for(int j =0; j<m;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//            System.out.println();


//     }
//     arrayDi(matrix, 9);
    
// }
// }

// again praticing 2d array question
// import java.util.*;
// public class Darray {
//     public static int largest(int matrix[][]){
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0; i<matrix.length;i++){
//             for(int j =0; j<matrix[0].length;j++){
//                 if (matrix[i][j] > largest) {
//                     largest = matrix[i][j];
                    
//                 }
//             }
//         }
//           System.out.print("The largest element is:-" +  largest);
        
//         return largest;
       
       
//     }

//     public static void main(String[] args) {
//         int matrix [][] = new int[2][3];
//         int n = matrix.length , m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i =0 ;i<n;i++){
//             for(int j = 0;j<m;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i =0; i<n;i++){
//             for(int j =0; j<m;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//        largest(matrix);
//     }
// }

// last question of 2d array find smallest element

// import java.util.*;
// public class Darray {
//     public static int smallest(int matrix[][]){
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if (matrix[i][j] < smallest) {
//                     smallest = matrix[i][j];
                    
//                 }
//             }
//         }
//         System.out.print("The smallest element is :-- " + smallest);
//         return smallest;
//     }

//     public static void main(String[] args) {
//         int matrix [][] = new int[2][3];
//         int n = matrix.length , m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<n;i++){
//             for(int j =0; j<m;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i =0; i<n; i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         smallest(matrix);
//     }
// }