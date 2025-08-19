public class sorted {
    public static boolean staircaseSearch(int matrix[][] , int key){
        int row =0 , col = matrix[0].length-1;
        while (row < matrix.length && col >=0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
                
            }
            else if (key < matrix[row][col]) {
                col--;
                
            }
            else{
                row++;
            }
            
        }
        System.out.println("Key is not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = {{10,20,30,40,},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
                          int key = 33;
                          staircaseSearch(matrix, key);
    }
    
}

new question sorted matrix 2d array

public class sorted {
    public static boolean staiSearch(int matrix[][] , int key){
        int row = 0 , col = matrix[0].length-1;
        while (row < matrix.length && col >=0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
                
            }
            else if (key < matrix[row][col]) {
                col--;
                
            }
            else{
                row++;
            }
            
        }
        System.out.println("Key is not found ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40,},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};   
                          int key = 39;    
                          staiSearch(matrix, key);                    
    }
}

last question of 2d array sorted matrix

public class sorted {
    public static boolean stairsSearch(int matrix[][], int key){
        int row = 0 , col = matrix[0].length-1;
        while (row < matrix.length && col >=0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at (" + row + "," + col + ")");
                return true;
                
            }
            else if (key < matrix[row][col]) {
                col--;
                
            }
            else{
                row++;
            }
            
        }
        System.out.println("key has not found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},
                          {5,6,7,8,},
                          {9,10,11,12},
                          {13,14,15,16}};
                          int key = 14;
                          stairsSearch(matrix, key);
    }
}

doing pratice question of sorted matrix

public class sorted {
    public static int pratice(int matrix[][]){
        int sum =0;
        for(int j =0 ; j<matrix[0].length;j++){
            sum += matrix[1][j];
        }
        System.out.println("Sum of the number :- " + sum);
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},
                          {11,4,3},
                           {2,2,3}};
                           pratice(matrix);
    }
}

new question

public class sorted {
    public static int pratices(int matrix[][]){
        int countof7 = 0;
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] == 7) {
                    countof7++;
                    
                }
            }
        }
        System.out.println("There are total number of 7 is :- " + countof7);
        return countof7;
    }

    public static void main(String[] args) {
        int matrix[][]= {{7,7,8},{8,7,7}};
        pratices(matrix);
    }
}