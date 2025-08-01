public class lec7 {
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        printHelloWorld();
    }
    
}
public class lec7 {

    public static int printSum(int a ; int b ;int c){
        int a = 55;
        int b = 45;
        int c = a+b;
        
    }
    public static void main(String[] args) {
        printSum();
    }
}

calculating two sum with function

import java.util.*;

public class lec7 {

    public static void calculateSum(int a , int b){
        int sum = a+b;
        System.out.println("the sum of two number is :" + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter teh first number :- ");
        int a = sc.nextInt();
       
         System.out.println("Enter the second number :- ");
        int b = sc.nextInt();
       
        calculateSum(a, b);
    }
}

product of two number
public class lec7 {

    public static int Multiply(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int product = Multiply(10,5);
        System.out.println("product of two number is:- " + product);
    }
}

factorial number
public class lec7 {

    public static int Factorial(int n){
        int f = 1;
        for(int i =1; i<=n;i++){
            f= f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(Factorial(3));
    }
}

fuction overloading -- function to calculate two number
public class lec7 {

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 6));
        System.out.println(sum(10, 5, 15));
    }
}


fuction overloading with datatypes parametr
public class lec7 {

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 10));
        System.out.println(sum(9.5f, 9.5f));
    }
}

printing prime number in a range
public class lec7 {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i<=n-1; i++){
            if(n % i == 0){
                isPrime = false;
            }
            
        }
        return isPrime;
        
    }

    public static void inRange(int n ){
        for(int i =2; i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        inRange(10);
    }
}

convert from binary to decimal
public class lec7 {

    public static void binTODec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit *(int) Math.pow(2, pow));
            pow++;
            binNum = binNum/10;

            
        }
        System.out.println("decimal of " + myNum  +" is  " + decNum);
    }
    public static void main(String[] args) {
        binTODec(1000);
    }
}

convert decimal to binary
public class lec7 {

    public static void decTOBin( int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n/2;
 }
 System.out.println("Binary of       " +  myNum +    "   is  "   + binNum );


    }
    public static void main(String[] args) {
        decTOBin(7);
    }
}