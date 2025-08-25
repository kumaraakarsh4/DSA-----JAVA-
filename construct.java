public class construct {
    public static void main(String[] args) {
        student s1 = new student();
        // System.out.println(s1.name);
        
    }
    
}
class student{
    String name;
    int roll;
    student(){
        System.out.println("This is student constructor... ");
        // this.name = name;

    }
}


// types of constructor
public class construct {

    public static void main(String[] args) {
        student s1 = new student();
       s1.name = "Aakarsh kumar";
       s1.roll = 112;
       s1.password = "Aakarsh456";
      
       s1.marks[0] =100;
       s1.marks[1]= 90;
       s1.marks[2]=80; 
       s1.marks[1] = 95;
        student s2 = new student(s1);
        
        
        for(int i=0;i<3;i++){
             
            System.out.println(s2.marks[i]);
           
        }


    }
}
class student{
    String name;
    int roll;
    String password;
   int marks [];

    // shallow  copy constructor
    // student(student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.password = s1.password;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.password = s1.password;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]= s1.marks[i];
        }
    }



    // Non paramterized constructor

    student(){
        marks = new int[3];
    System.out.println("This is student information");
    }

    // parametrized constructor


    student(String name){
        marks = new int[3];
        this.name = name;
    }
    student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}



static keywords 

public class construct {

    public static void main(String[] args) {
        student s1 = new student();
        s1.schoolName = "st.paul high school";
       

        student s2 = new student();
        System.out.println(s2.schoolName);
        
        student s3 = new student();
        s3.schoolName = "don bosco school";
        
    }
}
class student{
    String name;
    int roll;
    static String schoolName;
    

    void setName(String name){
        this.name = name;
    }
    
    String  getName(){
        return this.name;
    }
}

super constructor

public class construct {

    public static void main(String[] args) {
        Horse h = new Horse();
        
    }
}
class Animal{
    Animal(){
        System.out.println("Animal constructor is called...");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor is called..");
    }
}