doing this question in bubble sort

public class practiceinsertion {
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn<arr.length;turn++){
            for(int j = 0; j<arr.length-1-turn;j++){
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        printArray(arr);
    }
    
}

doing this question in selection sort

public class practiceinsertion {
    public static void selectSort(int arr[]){
        for(int i =0; i<arr.length;i++){
            int min = i;
            for(int j = i+1;j<arr.length-1;j++){
                if (arr[min] < arr[j]) {
                    min = j;
                    
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void prinArr(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selectSort(arr);
        prinArr(arr);
    }
}

doing this question in insertion sort

public class practiceinsertion {
    public static void insertSort(int arr[]){
        for(int i =0; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev >=0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
                
            }
            arr[prev+1] = curr;
        }
    }
    public static void prinnArr(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        insertSort(arr);
        prinnArr(arr);
    }
}

doin this question in couting sort

public class practiceinsertion {
    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            largest = Math.max(largest, arr[i]);

        }
        int count [] = new int [largest+1];
        for(int i = 0 ;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j =0;
        for(int i = count.length-1;i>=0;i--){
            while (count[i] > 0) {
                arr[j] = i;
                j++; 
                count[i]--;
                
            }

        }
    }
    public static void printAray(int arr[]){
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        countSort(arr);
        printAray(arr);
    }
}