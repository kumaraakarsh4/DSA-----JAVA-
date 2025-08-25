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