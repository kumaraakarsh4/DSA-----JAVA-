recurssion print in decreasing

public class Recurrsion {
    public static void printDec(int n){
        if (n == 1) {
            System.out.println(1);
            return;
            
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}

recurssion print in increasing

public class Recurrsion {
    public static void prinDec(int n){
        if (n == 10) {
            System.out.println(10);
            return;
            
        }

        System.out.print(n + " ");
        prinDec(n+1);
    }

    public static void main(String[] args) {
        int n = 1;
        prinDec(n);
    }
}

printing in increasing with 2nd method

public class Recurrsion {
    public static void printInc(int n){
        if (n == 1) {
            System.out.print(1 + " ");
            return;
            
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n =10;
        printInc(n);
    }
}

nexxt question of recurssion calculate factorial

public class Recurrsion {
    public static int  Fact(int n){
        if (n == 0) {
            return 1;
            
        }
        int fnm1 = Fact(n-1);
        int fn = n * Fact(n-1);
        
       
       return fn;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The final answer is :- " + Fact(n));
    }
} 

question of recursion calculate factorial

public class Recurrsion {
    public static int Fact(int n ){
        if (n == 0) {
            return 1;
            
        }
        int fm = Fact(n-1);
        int fn = n*Fact(n-1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("the value is :- " + Fact(n));
    }
}

next question print sum of n natural number

public class Recurrsion {
    public static int calcSum(int n){
        if (n == 1) {
            return 1;
            
        }
       int  snm1 = calcSum(n-1);
       int sn = n + snm1;
       return sn;

    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(calcSum(n));
    }
}

printing the fibonaci series

public class Recurrsion {
    public static int fibonaci(int n ){
        if (n == 0 || n == 1) {
            return n;
            
        }
        int fnm = fibonaci(n-1);
        int fn = fibonaci(n-2);
        int sum = fnm + fn ; 
        return sum ;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The sum of number is :- " + fibonaci(n));
    }
}

question of fibonaci series

public class Recurrsion {
    public static int finnac(int n){
        if (n == 0 || n == 1) {
            return n;
            
        }
        int fnm = finnac(n-1);
        int fn = finnac(n-2);
        int sum = fnm + fn;
        return sum;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println("The sum of number is :-- " + finnac(n));
    }
}