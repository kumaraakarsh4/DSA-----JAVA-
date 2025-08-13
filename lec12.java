import java.util.*;
public class lec12 {
    public static void reverNumber(int numbers[]){
        int first = 0 , last = numbers.length-1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]= temp;



            first++;
            last--;
            
        }
        
    }
    public static void main(String[] args) {
        int numbers[]= {2,3,4,6,8};
        reverNumber(numbers);
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
}


second pratice of reverse of an array

public class lec12 {
    public static void reverseNumber(int numbers[]){
        int first = 0 , last = numbers.length-1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]= temp;

            first++;
            last--;
            
        }
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        reverseNumber(numbers);
        for(int i =0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}


praticing again reverse question
public class lec12 {
public static void river(int numbers[]){
    int first = 0 ,  end = numbers.length-1;
    while (first < end) {
        int temp = numbers[end];
        numbers[end] = numbers[first];
        numbers[first] = temp;

        first++;
        end--;


        
    }
}
    public static void main(String[] args) {
        int numbers[]= {5,7,8,3,1,2};
        river(numbers);
        for(int i =0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}


reverse of array

public class lec12 {
    public static void rive(int numbers[]){
        int first = 0 , last = numbers.length-1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]= temp;

            first++;
            last--;
            
        }
    }

    public static void main(String[] args) {
        int numbers[]={9,8,7,6,5,4,3,2,1};
        rive(numbers);
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

pratice reverse // ------> 
public class lec12 {
    public static void renver(int numbers[]){
        int first = 0 , last = numbers.length-1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]= temp;

            first++;
            last--;
            
        }
    }

    public static void main(String[] args) {
        int numbers[]={2,3,4,8,9};
        renver(numbers);
        for(int i =0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");

        }
        System.out.println();

    }
}

practice reverse array

public class lec12 {
    public static void rener(int numbers[]){
        int first = 0 , last = numbers.length-1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]= temp;

            first++;
            last--;
            
        }
    }

    public static void main(String[] args) {
        int numbers[]={9,8,7,6,5,4,3,2,1};
        rener(numbers);
        for(int i =0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}