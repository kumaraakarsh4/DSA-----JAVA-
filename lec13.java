// public class lec13 {
//     public static void arrayPair(int numbers[]){
//         for(int i = 0; i< numbers.length;i++){
//             int curr = numbers[i];
//             for(int j = i+1; j<numbers.length;j++){
//                 System.out.print("(" + curr + " ," + numbers[j] + ")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int numbers[]= {2,4,6,8,10};
//         arrayPair(numbers);
//     }
    
// }

// practice pairs of array
// public class lec13 {
//     public static void pair(int numbers[]){
//         for(int i = 0; i<numbers.length; i++){
//             int curr = numbers[i];
//             for(int j = i+1; j<numbers.length;j++){
//                 System.out.print("(" + curr + "," + numbers[j] + " )");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[]={1,3,4,7,9};
//         pair(numbers);
//     }
// }

// pratice pairs array --->

// public class lec13 {
//     public static void paired(int numbers[]){
//         int tp = 0;
//         for(int i = 0; i<numbers.length;i++){
//             int curr = numbers[i];
//             for(int j = i+1; j<numbers.length;j++){
//                 System.out.print("(" + curr + "," + numbers[j]+ ")");

//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total pairs : -  " + tp);
//     }

//     public static void main(String[] args) {
//         int numbers[]={1,2,3,4,5,6};
//         paired(numbers);
//     }
// }

// practice question ----> pairs array

public class lec13 {
    public static void prind(int numbers[]){
        int pairs = 0;
        for(int i= 0; i<numbers.length;i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");

                pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs :-- " + pairs);
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        prind(numbers);
    }
}