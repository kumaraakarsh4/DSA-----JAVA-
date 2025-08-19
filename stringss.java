public class stringss {
    public static String subStris(String str , int si , int ei){
        String subStr = "";
        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subStris(str, 0, 5));
    }
    
}

new question of substring

public class stringss {
    public static String stris(String str , int si , int ei){
        String subStr = "";
        for(int i=si; i<ei;i++){
            subStr += str.charAt(i);

        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "Aakarsh";
        System.out.println(stris(str, 0, 7));
    }
}

finding largest string 

public class stringss {

    public static void main(String[] args) {
        String fruit [] ={"apple" , "mango" , "banana"};
        String largest = fruit[0];
        for(int i=0; i<fruit.length;i++){
           
            if ( largest.compareTo(fruit[i]) < 0 ) {
                largest = fruit[i];
                
            }
        }
        System.out.println(largest);
    }
}

question of find vowels in an string

import java.util.*;
public class stringss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :-");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                
            }

        }
        System.out.println("Count of vowels is :-- " + count);
        
    }
}