// public class insertion {
//     public static void insertSort(int arr[]){
//         for(int i = 1; i<arr.length;i++){
//             int curr = arr[i];
//             int prev = i-1;
//             while (prev >=0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
                
//                 prev--;
                
//             }
//             arr[prev+1] = curr;

//         }
//     }
//     public static void prinArr(int arr[]){
//         for(int i = 0; i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//        public static void main(String[] args) {
//         int arr[] = {5,4,1,3,2};
//         insertSort(arr);
//         prinArr(arr);
        

//     }
    
// }
 //  praticing new insertion sort question

//  public class insertion {
//     public static void inserSor(int arr[]){
//         for(int i = 1; i<arr.length;i++){
//             int curr = arr[i];
//             int prev = i-1;
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
                
//             }
//             arr[prev+1] = curr;
//         }
//     }
//     public static void prinArrt(int arr[]){
//         for(int i = 0 ; i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
 
//     public static void main(String[] args) {
//         int arr[]={8,6,4,2,1};
//         inserSor(arr);
//         prinArrt(arr);
//     }
//  }

// new question insertion sort--->
// public class insertion {
//     public static void inserSort(int arr[]){
//         for(int i =0; i<arr.length;i++){
//             int curr = arr[i];
//             int prev = i-1;
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
                
//             }
//             arr[prev+1] = curr;
//         }
//     }
//     public static void printArrt(int arr[]){
//         for(int i = 0; i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {9,7,5,3,2,1};
//         inserSort(arr);
//         printArrt(arr);
//     }
// }

// last question insert sorting

public class insertion {
    public static void insertSorting(int arr[]){
        for(int i = 0; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
                
            }
            arr[prev+1] = curr;
        }
    }
    public static void PrinArrays(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] ={7,5,9,4,1,25,94};
        insertSorting(arr);
        PrinArrays(arr);
    }
}