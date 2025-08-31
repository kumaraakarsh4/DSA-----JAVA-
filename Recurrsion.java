// recurssion print in decreasing

// public class Recurrsion {
//     public static void printDec(int n){
//         if (n == 1) {
//             System.out.println(1);
//             return;
            
//         }
//         System.out.print(n + " ");
//         printDec(n-1);
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);
//     }
// }

// recurssion print in increasing

// public class Recurrsion {
//     public static void prinDec(int n){
//         if (n == 10) {
//             System.out.println(10);
//             return;
            
//         }

//         System.out.print(n + " ");
//         prinDec(n+1);
//     }

//     public static void main(String[] args) {
//         int n = 1;
//         prinDec(n);
//     }
// }

// printing in increasing with 2nd method

// public class Recurrsion {
//     public static void printInc(int n){
//         if (n == 1) {
//             System.out.print(1 + " ");
//             return;
            
//         }
//         printInc(n-1);
//         System.out.print(n + " ");
//     }

//     public static void main(String[] args) {
//         int n =10;
//         printInc(n);
//     }
// }

// nexxt question of recurssion calculate factorial

// public class Recurrsion {
//     public static int  Fact(int n){
//         if (n == 0) {
//             return 1;
            
//         }
//         int fnm1 = Fact(n-1);
//         int fn = n * Fact(n-1);
        
       
//        return fn;

//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println("The final answer is :- " + Fact(n));
//     }
// } 

// question of recursion calculate factorial

// public class Recurrsion {
//     public static int Fact(int n ){
//         if (n == 0) {
//             return 1;
            
//         }
//         int fm = Fact(n-1);
//         int fn = n*Fact(n-1);
//         return fn;
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("the value is :- " + Fact(n));
//     }
// }

// next question print sum of n natural number

// public class Recurrsion {
//     public static int calcSum(int n){
//         if (n == 1) {
//             return 1;
            
//         }
//        int  snm1 = calcSum(n-1);
//        int sn = n + snm1;
//        return sn;

//     }

//     public static void main(String[] args) {
//         int n =5;
//         System.out.println(calcSum(n));
//     }
// }

// printing the fibonaci series

// public class Recurrsion {
//     public static int fibonaci(int n ){
//         if (n == 0 || n == 1) {
//             return n;
            
//         }
//         int fnm = fibonaci(n-1);
//         int fn = fibonaci(n-2);
//         int sum = fnm + fn ; 
//         return sum ;
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("The sum of number is :- " + fibonaci(n));
//     }
// }

// question of fibonaci series

// public class Recurrsion {
//     public static int finnac(int n){
//         if (n == 0 || n == 1) {
//             return n;
            
//         }
//         int fnm = finnac(n-1);
//         int fn = finnac(n-2);
//         int sum = fnm + fn;
//         return sum;
//     }

//     public static void main(String[] args) {
//         int n = 11;
//         System.out.println("The sum of number is :-- " + finnac(n));
//     }
// }

// next recurssion question check sorted array

// public class Recurrsion {
//     public static boolean isSorted(int arr[] , int i){
//         if (i == arr.length-1) {
//             return true;
            
//         }
//         if (arr[i] > arr[i+1]) {
//             return false;
            
//         }
//         return isSorted(arr, i+1);
//     }

//     public static void main(String[] args) {
//         int arr[] ={1,2,3,4,5};
//        System.out.println( isSorted(arr, 0));
        
//     }
// }

// next question checking sorted array

// public class Recurrsion {
//     public static boolean isSort(int arr[] , int i ){
//         if (i == arr.length-1) {
//             return true;
            
//         }
//         if (arr[i] > arr[i+1]) {
//             return false;
            
//         }
//         return isSort(arr, i+1);
//     }

//     public static void main(String[] args) {
//         int arr[]={1,5,8,7};
//         System.out.println(isSort(arr, 0));
        
//     }
// }

// wap to check first occur of an element at index

// public class Recurrsion {
//     public static int firstOcuur(int arr[] , int key , int i){
//         // for base class

//         if (i == arr.length) {
//             return -1;
            
//         }
//         if (key == arr[i]) {
//             return i;
            
//         }
//         return firstOcuur(arr, key, i+1);
//     }

//     public static void main(String[] args) {
//         int arr[]={1,2,4,5,8,9,5};
//         int key =  5;
//         System.out.println("The Value is at index : --- " + firstOcuur(arr, key, 0) );
//     }
// }

// next question for check first occur of an element

public class Recurrsion {
    public static int firstOccu(int arr[] , int key , int i){
        // for base class
          if (i == arr.length) {
            return -1;
            
          }

        if (key == arr[i]) {
            return i;
            
        }
        return firstOccu(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[]= {1,2,5,7,8,9,4,6,3};
        int key = 9;
        System.out.println("The value is at index :-- " + firstOccu(arr, key, 0));
    }
}

question of recurssion last occurance question
public class Recurrsion {
  public static int lastOcuur(int arr[] , int key , int i){
     if (i == arr.length) {
            return -1;

  }
   int isfound = lastOcuur(arr, key, i+1);
   if (isfound ==  -1 && arr[i] == key) {
    return i;
   }
   return isfound;
  }


  public static void main(String[] args) {
     int arr[]= {1,2,5,7,8,9,4,5,3};
     int key = 5;
     System.out.println("the value is at index :-- " + lastOcuur(arr,key, 0));



    
  }

}

next question of last ocuur

public class Recurrsion {
  public static int lastOcc(int arr[] , int key , int i){
    if (i == arr.length) {
      return -1;
      
    }
    int isfound = lastOcc(arr, key, i+1);
    if (isfound == -1 && arr[i] == key)  {
      return i;
      
    }
    return isfound;
  }

  public static void main(String[] args) {
    int arr[] = {2,5,7,8,4,3,7};
    int key = 7;
    System.out.println("The value is found at index :-- " + lastOcc(arr, key, 0));
  }
}


public class Recurrsion {
  public static int lastOcc(int arr[] , int key , int i){
    if (i == arr.length) {
      return -1;
      
    }
    int isfound = lastOcc(arr, key, i+1);
    if (isfound == -1 && arr[i] == key)  {
      return i;
      
    }
    return isfound;
  }

  public static void main(String[] args) {
    int arr[] = {2,5,7,8,4,3,7};
    int key = 7;
    System.out.println("The value is found at index :-- " + lastOcc(arr, key, 0));
  }
}
