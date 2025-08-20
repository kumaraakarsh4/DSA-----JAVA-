it is AND operator ( & )
public class bitmani {
    public static void main(String[] args) {
        System.out.println(5 & 6);
    }
    
}

it is OR operator ( | )

public class bitmani {

    public static void main(String[] args) {
        System.out.println(5 | 6);
    }
}

it is XOR operator ( ^ )

public class bitmani {

    public static void main(String[] args) {
        System.out.println(5 ^ 6);
    }
}

it is one's compliment ( ~ )

public class bitmani {

    public static void main(String[] args) {
        System.out.println((~-5));
    }
}

it is binary left shift operator ( << )

public class bitmani {

    public static void main(String[] args) {
        System.out.println(5 << 2);
    }
} 

it is binary right shift operator ( >> )

public class bitmani {

    public static void main(String[] args) {
        System.out.println(6>>1);
    }
}

question of bitmanipulation of odd and even

public class bitmani {

    public static void oddEven(int n ){
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("the number is even");
            
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        oddEven(10);
    }
}

doing the bitmanipulation question of odd and even

public class bitmani {

    public static void oddsEven(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("The number is even");
            
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        oddsEven(13);
    }
}