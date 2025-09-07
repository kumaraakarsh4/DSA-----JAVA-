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

 SOLVING N QUEENS PROBLEM

public class Backtracking {
    public static void nQueen(char board[][] , int row){
        if (row == board.length) { // base case
            printBoard(board);
            return;
            
        }
        // column loop
        for(int j=0;j<board.length;j++){
            board[row][j] = 'Q';
            nQueen(board, row+1); // function call 
            board[row][j] = 'x'; // backtracking process
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("---------- chess board --------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
             System.out.println();
    }
        }
       

    public static void main(String[] args) {
        int n = 2;
        char board [] [] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        nQueen(board,0);
        printBoard(board);
    }
}

SOLVING NEXT QUESTION N QUEENS 4TH APPROACH

public class Backtracking {
    public static boolean isSafe(char board[][] , int row , int col){
        // for vertical up
        for(int i=row-1;i>=0;i--){
            if (board[i][col] == 'Q') {
                return false;
                
            }
        }
        // diagonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
             if (board[i][j] == 'Q') {
                return false;
                
            }

        }
        // diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i-- , j++){
             if (board[i][j] == 'Q') {
                return false;
                
            }
        }
        return true;
    }

    public static void nQueen(char board[][], int row){
        if (row == board.length) {
            printBoard(board);
            return;
            
        }
        for(int j=0 ; j<board.length;j++){
            if(isSafe(board,row,j)){
                 board[row][j] = 'Q';
            nQueen(board, row+1);
            board[row][j] = 'x';

            }
            
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("--------- chess board-----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board [][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        nQueen(board,0);
    }
}



NEXT QUESTION OF N QUEEN [ PRINT 1 SOLUTION QUESTION]


public class Backtracking {
    public static boolean isSafe(char board[][] , int row , int col){
        // for vertical up
        for(int i=row-1;i>=0;i--){
            if (board[i][col] == 'Q') {
                return false;
                
            }
        }
        // diagonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
             if (board[i][j] == 'Q') {
                return false;
                
            }

        }
        // diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i-- , j++){
             if (board[i][j] == 'Q') {
                return false;
                
            }
        }
        return true;
    }

    public static boolean nQueen(char board[][], int row){
        if (row == board.length) {
           // printBoard(board);
            return true;
            
        }
        for(int j=0 ; j<board.length;j++){
            if(isSafe(board,row,j)){
                 board[row][j] = 'Q';
            if(nQueen(board, row+1)){
                return true;
            }
            board[row][j] = 'x';

            }
            
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("--------- chess board-----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board [][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        if(nQueen(board,0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
    }
}

 GRID WAYS QUESTION OF BACKTRACKING

public class Backtracking {
    public static int gridWay(int i , int j , int n , int m ){
        if (i == n-1 && j == m-1) {
            return 1;
            
        }else if (i == n || j == m) {
            return 0;
            
        }{

        }
        int w1 = gridWay(i+1, j, n, m);
        int w2 = gridWay(i, j+1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3 , m =3;
        System.out.println(gridWay(0, 0, n, m));

    }
}

SOLVING GRID WAYS 4*4 QUESTION 

public class Backtracking {
    public static int griWays(int i , int j , int n , int m){
        if (i == n-1 && j == m-1) {
            return 1;
            
        }else if (i== n || j == m) {
            return 0;
            
        }
        int w1 = griWays(i+1, j, n, m);
        int w2 =  griWays(i, j+1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n=4 , m=4;
        System.out.println(griWays(0, 0, n, m));

    }
}