DIVIDE AND CONQUER [MERGE SORT]
public class Divideandconquer {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
    public static void mergSort(int arr[] , int si , int ei){
        // base case
        if (si >= ei) {
            return;
            
        }
        int mid = si + (ei - si)/2; // for finding mid value
        mergSort(arr, si, mid); // for finding left part
        mergSort(arr, mid+1, ei); // for finding right part
        merg(arr, si, mid ,  ei);
    }
    public static void merg(int arr[] , int si , int mid , int ei){
        int temp[] = new int [ei - si + 1];
        int i = si; // iterator for left
        int j = mid+1; // for right
        int k = 0; // for temp
        while (i<= mid && j<=ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
                
            }else{
                temp[k] = arr[j];
                k++;
                j++;
            }
            
        } 
        while (i<= mid) {
            temp[k++] = arr[i++];
            
        }
        while (j<=ei) {
            temp[k++] = arr[j++];
            
        }
        for( k=0 , i=si ;k<temp.length;k++,i++){
            arr[i] = temp[k];

        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergSort(arr, 0,arr.length-1);
        printArr(arr);

        
    }
    
}

// DIVIDE AND CONQUER [QUICK SORT]
public class Divideandconquer {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[] , int si , int ei){
        if (si >= ei) {
            return;
            
        }
        int pidx = partition(arr , si , ei);
        quickSort(arr, si, pidx-1); // for left part
        quickSort(arr, pidx+1, ei); // for right part
    }
    public static int partition(int arr[] ,   int si, int ei){
        int pivot = arr[ei];
        int i = si -1 ; // for left iterator
        for(int j=si; j<ei;j++){
            if (arr[j] <= pivot) {
                i++;
                // we swap the element
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                
            }
        }
        i++;
        // we swap the element for pivot
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
        

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}