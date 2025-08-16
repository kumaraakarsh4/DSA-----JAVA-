public class sorting {
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn<arr.length-1;turn++){
        for(int j = 0; j<arr.length-1-turn;j++){
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
                
            }
        }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
    
}

again praticing bubble sort question

public class sorting {
    public static void bubbleSor(int arr[]){
        for(int i = 0 ; i<arr.length-1;i++){
            for(int j = 0; j<arr.length-1-i; j++ ){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }
    public static void prinArr(int arr[]){
        for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={9,7,5,3,1};
        bubbleSor(arr);
        prinArr(arr);
    }
}

praticing bubble sort questions

public class sorting {
    public static void bubbles(int arr[]){
        for(int i =0; i<arr.length-1;i++){
            for(int j = 0; j<arr.length-1-i;j++){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    public static void printAr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int arr[]={10,8,6,4,2};
         bubbles(arr);
         printAr(arr);
        
    }

   
}

last question bubble sort
public class sorting {
    public static void bubleSort(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            for(int j = 0; j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]) {
                     int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
                    
                }
               
            }
        }
    }
    public static void printArra(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={9,5,4,7,2,1};
        bubleSort(arr);
        printArra(arr);
    }
}