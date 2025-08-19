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

new string question

public class string {
    public static float getPaths(String path){
        int x =0 , y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if (dir == 'N') {
                y++;
                
            }
            else if (dir == 'S') {
                y--;
                
            }
            else if (dir == 'W') {
                x--;
                
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getPaths(path));
    }
}

doing the same question shotest path

public class string {
    public static float shortPath(String path){
        int x =0 , y=0;
        for(int i =0; i<path.length();i++){
            char dir = path.charAt(i);
            if (dir == 'N') {
               y++; 
            }else if (dir == 'S') {
                y--;
                
            }else if (dir == 'w') {
                x--;
                
            }else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WN";
        System.out.println(shortPath(path));
    }
}