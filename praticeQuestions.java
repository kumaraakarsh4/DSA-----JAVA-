
// IN BUBBLE SORT
// public class praticeQuestions {
//     public static void bubble(int arr[]){
//         for(int turn = 0;turn<arr.length-1;turn++){
//             for(int j= 0;j<arr.length-1-turn;j++){
//                 if (arr[j] < arr[j+1]) {
//                     int temp = arr[j+1];
//                     arr[j+1] = arr[j];
//                     arr[j] = temp;

                    
//                 }

//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] ={3,6,2,1,8,7,4,5,3,1};
//        bubble(arr);
//        printArr(arr);
//     }
    
// IN SELECTION SORT

// public class praticeQuestions {
//     public static void selection(int arr[]){
//         for(int turn =0;turn<arr.length;turn++){
//             int minPos = turn;
//             for(int j=turn ; j<arr.length;j++){
//                 if (arr[minPos]  < arr[j]) {
//                     minPos = j;
                    
//                 }
//             }
//             int temp = arr[turn];
//             arr[turn] = arr[minPos];
//             arr[minPos] = temp;

//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i =0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] ={3,6,2,1,8,7,4,5,3,1};
//         selection(arr);
//         printArr(arr);
//     }
// }
  
// ------------------------------------------------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// BITMANIPULATION QUESTION PRACTICE

public class praticeQuestions {

    public static void main(String[] args) {
        int x =3  ;
        int y =4;
        System.out.println("Before swap x = " + x + "y = " + y);
        x= x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap x =" + x + "y =" + y);

    }
}

