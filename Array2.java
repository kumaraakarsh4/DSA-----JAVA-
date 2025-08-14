import java.util.*;
public class Array2 {
    public static void sumPre(int arr[]){
        int curr = 0; 
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];
         prefix[0]= arr[0];
        for(int i= 1; i<prefix.length;i++){
            prefix[i]= prefix[i-1] + arr[i];
        }
        for(int start=0; start<arr.length;start++){
            for(int end = start; end<arr.length;end++){
                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if (maxsum < curr) {
                maxsum = curr;
                
            }

            }
            
    }
    System.out.println("Max sum is :-- " + maxsum);
}
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};
        sumPre(arr);
    }
    
}

prefix question pratice ---->>>

public class Array2 {
    public static void prefe(int arr[]){
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int [arr.length];
        prefix[0]=arr[0];
        for(int i =1; i<prefix.length;i++){
            prefix[i]= prefix[i-1] + arr[i];
        }
        for(int start = 0; start<arr.length;start++){
            for(int end = start; end<arr.length;end++){
                curr = start==0 ? prefix[end]: prefix[end] - prefix[start-1];
                if (maxsum < curr) {
                    maxsum = curr;
                    
                }
            }
        }
        System.out.println("Max value is :-- " + maxsum);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        prefe(arr);

    }
}

praticing question prefix array

public class Array2 {
    public static void sumPref(int arr[]){
        int curr = 0; 
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int [arr.length];
        prefix[0]= arr[0];
        for(int i = 1; i<prefix.length;i++){
            prefix[i]= prefix[i-1] + arr[i];
        }
        for(int start = 0; start<arr.length;start++){
            for(int end = start; end<arr.length;end++){
                curr = start == 0 ? prefix[end]: prefix[end] - prefix[start-1];
                if (maxsum < curr) {
                    maxsum = curr;
                    
                }
            }
        }
        System.out.println("Max value is : -- " + maxsum);
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        sumPref(arr);
    }
}

