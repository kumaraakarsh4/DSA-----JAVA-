// public class lec6 {
//     public static void main(String[] args) {
//         int n =5;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n-i);
//             for(int j = 1 ; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j =1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // for second half of the butterfly pattern 
//         for(int i = n; i>=1; i--){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n-i);
//             for(int j = 1 ; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j =1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }



// public class lec6 {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1 ; i<=n; i++){
//             for(int j = 1 ; j<= n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// for pyramind pattern printing 
// public class lec6 {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1 ; i<= n; i++){
//             for(int j =1 ; j<=n-i; j++){
//                 System.out.print(" ");
//             }
// //it is printing row number-->into no row times means row no is 2 it is printing 2 two times
//             for(int j = 1 ; j<=i; j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// printing the pattern of pallindromic number
// public class lec6 {

//     public static void main(String[] args) {
//         int n  = 5;
//         for(int i =1; i<=5;i++){
//             for(int j =1 ; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j =i; j>=1; j--){
//                 System.out.print(j + " ");
//             }
//             for(int j = 2; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// for printing diamond pattern

// public class lec6 {

//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = 1; i<=n; i++){
//             for(int j =1 ; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             int stars = 2 * i-1;
//             for(int j = 1; j<=stars; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//          for(int i = n; i>=1; i--){
//             for(int j =1 ; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             int stars = 2 * i-1;
//             for(int j = 1; j<=stars; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }

// printing left hand pyramind
// public class lec6 {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i<= n; i++){
//             for(int j =1; j<=n-i; j++){
//                 System.out.print("  ");
//             }
            
//             for(int j =1; j<=i; j++){
//                 System.out.print("*" );
//             }
//             System.out.println();
//         }
//     }
// }

// printing hollow rectangle
// public class lec6 {

//     public static void main(String[] args) {
//         int n = 4;
//         int m =5;
//         for(int i = 1; i<=n; i++){
//             for(int j =1; j<=m; j++){
//                 if(i == 1 || j == 1 || i == n || j == m){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// printing the invert half pyramind
// public class lec6 {

//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = 1; i<=n; i++){
//             for(int j =1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// printing half pyramind with number 
public class lec6 {

    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}