// import  java. util.Scanner;
// public class lec8 {
//     public static double Average(double x, double y, double z){
//         return (x+y+z) / 3;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number :- ");
//         double x = sc.nextDouble();
//         System.out.println("Enter the second number :- ");
//         double y = sc.nextDouble();
//         System.out.println("Enter the third number :- ");
//         double z = sc.nextDouble();
//         System.out.println("Sum of the average is : - " + Average(x, y, z) );
//     }
    
// }


// second function question
// import java . util. Scanner;
// public class lec8 {

//     public static boolean isPalandrome(int number){
//         int palindrome = number;
//         int reverse = 0;
//         while (palindrome != 0) {
//             int remainder = palindrome % 10;
//             reverse = reverse * 10 + remainder;
//             palindrome = palindrome / 10;
            
//         }
//         if (number == reverse) {
//             return true;
            
//         }else{
//             return false;
//         }
//     }
//             public static void main(String[] args) {
//         System.out.println("Enter the number :- ");
//         Scanner sc = new Scanner(System.in);
//         int palindrome = sc.nextInt();
//         if (isPalandrome(palindrome)) {
//             System.out.println("Number :- " + palindrome + "     The number is palindrome");
            
//         }else{
//             System.out.println("Number :- " + palindrome + "   The number is not palindrome"   );
//         }

        
//     }
// }

// question 3
// import java . util. Scanner;
// public class lec8 {

//     public static int sumDigit(int n){
//         int SumOfDigits = 0;
//         while (n > 0) {
//             int lastDigit = n % 10;
//              SumOfDigits +=  lastDigit;
//              n /= 10;

            
//         }
//         return SumOfDigits;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the integer number :-- ");
//         int digit = sc.nextInt();
//         System.out.println("Sum of the number is :-- " + sumDigit(digit));
//     }
// }