// public class lec11 {
//     public static int binarySearch(int numbers[] , int key){
//     int start = 0 , end = numbers.length-1 ;
//     while (start <= end) {
//         int mid = (start + end) / 2;
//         if (numbers[mid]== key) {
//             return mid;
            
//         }
//         if (numbers[mid]< key) {
//             start = mid + 1;
            
//         }
//         else{
//             end = mid - 1;
//         }
        
//     }
//     return -1;
// }

//     public static void main(String[] args) {
//         int numbers[]={-1,0,3,4,5,9,12};
//         int key = 9;
//         System.out.println(binarySearch(numbers, key));
//     }
    
// }


public class lec11 {
    public static int binarySearch(int numbers[], int key){
        int start = 0 ,  end = numbers.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if ( numbers[mid]== key) {
                return mid; 

            }
            if (numbers[mid]< key) {
                start=  mid + 1;
                
            }
            else{
                end =  mid-1;
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[]= {2,5,6,7,8,9,11};
        int key = 5;
        System.out.println(binarySearch(numbers, key));
    }
}