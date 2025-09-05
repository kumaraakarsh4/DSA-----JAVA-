public class Backtracking {
    public static void changeArr(int arr[] , int i , int val){
        if (i == arr.length) {  // base case
            printArr(arr);
            return;
            
        }

        arr[i] = val; // recurssion
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2; // Backtracking step
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

    }
    
}


NEXT QUESTION OF BACKTRACKING
public class Backtracking {
    public static void chngeAr(int arr[] , int i , int val){
        if (i == arr.length) {
            printArr(arr);
            return;
         }
        arr[i] = val;
        chngeAr(arr, i+1, val+1);
        arr[i] = arr[i] - 2 ;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[6];
        chngeAr(arr, 0, 1);
        printArr(arr);

    }
}

NEXT QUESTION OF BACKTRACKING FINDING ALL SUBSET OF ARRAY

public class Backtracking {
    public static void findSubset(String str , String ans , int i){
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
                
            }else{
                System.out.println(ans);
            }
            return;
            
        }
        findSubset(str, ans+str.charAt(i), i+1);
        findSubset(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}

NEXT QUESTION OF BACKTRACKING FINDING ALL SUBSET OF ARRAY

public class Backtracking {
    public static void findSub(String str , String ans ,  int i){
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
                
            }else{
                System.out.println(ans);
            }
            return;
            
        }
        findSub(str, ans+str.charAt(i), i+1);
        findSub(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "def";
        findSub(str, "", 0);
    }
}

BACKTRACKING QUESTION PERMUTATION

public class Backtracking {
    public static void findPermut(String str , String ans){
        if (str.length() == 0) {
            System.out.println(ans);
            return;
            
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermut(Newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermut(str, "");
    }
}

BACKTRACKING NEXT QUESTION PERMUTATION

public class Backtracking {
    public static void findPerm(String str , String ans){
        if (str.length() == 0) {
            System.out.println(ans);
            return;
            
        }
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPerm(Newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "def";
        findPerm(str, "");
    }
}