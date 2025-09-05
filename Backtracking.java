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