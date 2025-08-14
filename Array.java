import java.util.*;
public class Array {
    public static void maxSum(int arr[]){
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            int start = i;
            for(int j =i; j<arr.length;j++){
                int end = j;
                curr = 0;
                for(int k = start; k<=end;k++){
                    curr += arr[k];

                }
                System.out.println(curr);
                if (maxsum < curr) {
                    maxsum = curr;
                    
                }

            }
        }
        System.out.println("Max sum is :-  " + maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxSum(arr);
    }
    
}

pratice max sum questions ----->

public class Array {
    public static void sumArr(int arr[]){
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            int start = i;
            for(int j =i; j<arr.length;j++){
                int end = j;
                curr = 0;
                for(int k = start; k<= end;k++){
                    curr += arr[k];
                }
                System.out.println(curr);
                if (maxsum < curr) {
                    maxsum = curr;
                    
                }
            }
        }
        System.out.println("Max sum is : -- " + maxsum);
    }

    public static void main(String[] args) {
        int arr []= {1,3,5,7,9};
        sumArr(arr);
    }
}

praticing max array ------> question

public class Array {
    public static void maxAray(int arr[]){
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            int start = i;
            for(int j = i; j<arr.length;j++){
                int end = j;
                curr = 0;
                for(int k =  start ; k<= end; k++){
                    curr += arr[k];

                }
                System.out.println(curr);
                if (maxsum < curr) {
                    maxsum = curr;
                }
            }
        }
        System.out.println("Max sum is : -- " + maxsum);
    }

    public static void main(String[] args) {
        int arr[]= {1,5,6,7,9,10,12};
        maxAray(arr);
    }
}

praticing question max array --->

public class Array {
    public static void maArr(int arr[]){
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            int start = i;
            for(int j = 0; j<arr.length;j++){
                int end = j;
                curr = 0;
                for(int k = start; k<= end; k++){
                    curr += arr[k];

                }
                System.out.println(curr);
                System.out.println();
                if (maxSum < curr) {
                    maxSum = curr;
                    
                }
            }
        }
        System.out.println("Max value is : --  " + maxSum);
    }

     public static void main(String[] args) {
        int arr[]= {-1,-2,4,6,9};
        maArr(arr);
     }
}

prtice questions -----> max //array

public class Array {
    public static void maxArr(int arr[]){
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i  =0; i<arr.length;i++){
            int first = i;
            for(int j = i; j<arr.length;j++){
                int end = j;
                curr = 0;
                for(int k = first; k<=end;k++){
                    curr += arr[k];
                }
                System.out.println(curr);
                System.out.println();
                if (maxsum < curr) {
                    maxsum = curr;
                    
                }
            }
        }
        System.out.println("Max value is :--- " + maxsum);
    }

    public static void main(String[] args) {
        int arr[]= {4,5,8,9,7};
        maxArr(arr);
    }
}