public class stringss {
    public static String subStris(String str , int si , int ei){
        String subStr = "";
        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subStris(str, 0, 5));
    }
    
}

new question of substring

public class stringss {
    public static String stris(String str , int si , int ei){
        String subStr = "";
        for(int i=si; i<ei;i++){
            subStr += str.charAt(i);

        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "Aakarsh";
        System.out.println(stris(str, 0, 7));
    }
}