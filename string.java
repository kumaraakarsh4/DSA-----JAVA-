public class string {
    public static boolean palindrome(String str){
        for(int i=0; i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindrome(str));
    }
    
}

next question of string

public class string {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
                
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str));
    }
}

next question of string 

public class string {
    public static boolean isPalan(String str){
        for(int i=0; i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
                
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "moon";
        System.out.println(isPalan(str));
    }
}

last question of string palindrome

public class string {
    public static boolean isPaland(String str){
        for(int i=0;i<str.length()/2;i++){
            int n= str.length();
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
                
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "dance";
        System.out.println(isPaland(str));
    }
}