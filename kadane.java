public class kadane {
    public static void kadans(int arr[]){
    int cs = 0;
    int ms = Integer.MIN_VALUE;
    for(int i = 0 ; i<arr.length;i++){
        cs = cs + arr[i];
        if (cs < 0) {
            cs = 0;
            
        }
        ms = Math.max(cs, ms);
        
    }
    System.out.println("Max value is : --- " + ms);
}
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadans(arr);
    }
    
}

praticing kadane problem --->
public class kadane {
    public static void kadai(int arr[]){
        int cs = 0;
        int ms =  Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            cs = cs + arr[i];
            if (cs < 0 ) {
                cs = 0;
                
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max value is :-- " + ms);
    }

    public static void main(String[] args) {
        int arr[]= {-2,-1,5,-2,-1,3,6};
        kadai(arr);
    }
}

new question on kadane algorithm
public class kadane {
    public static void kadanes(int arr[]){
        int cs = 0; 
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
                
            }
            ms =  Math.max(cs, ms);
        }
        System.out.println("Max value is :-- " + ms );
    }

    public static void main(String[] args) {
        int arr[]={-3,-1,6,3,-2,-1,5,4};
        kadanes(arr);
    }
}

practicing kadanes algorithm

public class kadane {
    public static void kadani(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
                
            }
            ms =  Math.max(cs, ms);
        }
        System.out.println("Max value is :-- " + ms);
    }

    public static void main(String[] args) {
        int arr[]={2,3,-1,-2,5,4,-1};
        kadani(arr);
    }
}

praticing of kadane algorithm

public class kadane {
    public static void kadanoyi(int arr[]){
        int cs = 0; 
        int ms = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
                
            }
            ms =  Math.max(cs, ms);
        }
        System.out.println("Max value is : -- " + ms);
    }

    public static void main(String[] args) {
        int arr[]={4,2,-1,-2,3,-1,5};
        kadanoyi(arr);
    }
}

praticing again kadanes algorthim 
public class kadane {
    public static void kadaniAlgo(int arr[]){
        int cs = 0; 
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            cs =  cs + arr[i];
            if (cs < 0) {
                cs = 0;

                
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max value is :-- " + ms);
    }

    public static void main(String[] args) {
        int arr[]={4,2,-1,-2,3,-1,-5};
        kadaniAlgo(arr);
    }
}