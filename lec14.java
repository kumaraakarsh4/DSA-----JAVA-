public class lec14 {
    public static void subArray(int numbers[]){
        for(int i =0; i<numbers.length;i++){
              int start = i;
            for(int j = i; j<numbers.length;j++){
                int end = j;
                for(int k = start; k<= end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();

            }
        

        }
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subArray(numbers);
    }
    
}

pratice question ---> printing sub array

public class lec14 {
    public static void printArra(int arr[]){
        for(int i = 0; i<arr.length;i++){
            int start= i;
            for(int j = i; j<arr.length;j++){
                int end = j;
                for(int k = start; k<=end;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        printArra(arr);
    }
}

praticing sub array ------> questions

public class lec14 {
    public static void subArr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            int start = i;
            for(int j =i ; j<arr.length;j++){
                int end = j;
                for(int k = start; k<= end;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11};
        subArr(arr);

    }
}

pratice sub array print ------>

public class lec14 {
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length;i++){
            int start = i;
            for(int j= i; j<arr.length;j++){
                int end = j;
                for(int k = start; k<=end;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        printArr(arr);
    }
}

printing sub array ------->

public class lec14 {
    public static void sumArr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            int start = i; 
            for(int j= i ; j<arr.length;j++){
                int end = j;
                for(int k = start; k<=end;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]={7,5,3,4,8,9,2,1};
        sumArr(arr);
    }
}