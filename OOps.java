public class OOps {
   public static void main(String[] args) {
    BankAccount myacc = new BankAccount();
        myacc.username = "Aakarsh Kumar";
        myacc.password = "Aakarsh@2002";
        
   }
    
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}


Inheritence 

public class OOps {

    public static void main(String[] args) {
        cat rock = new cat();
       rock.walk();
       rock.swim();
       rock.eat();
       System.out.println();
       shark rugu = new shark();
       rugu.diver();
       rugu.fins();
       rugu.eat();
       System.out.println();
       parrot mithu = new parrot();
       mithu.fly();
       mithu.eat();
       mithu.breathe();
       mithu.speak();
       
    }
}

// base class / parent class
class Animal{
    String colour;
    void eat(){
        System.out.println("She can eats");
    }
    void breathe(){
        System.out.println("She can breathe");
    }
    

}
derived claas / child class
class fish extends Animal{
    int fins;
    void swim(){
        System.out.println("She can swim");
    }
}

Multilevel inheritence 

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}

Hierarichal inheritence 

class Mammal extends Animal{
    void walk(){
        System.out.println("Can walk");
    }
}
class fish extends Mammal{
    void swim(){
        System.out.println("can swim");
    }
}
class bird extends Mammal{
    void fly(){
        System.out.println("can fly");
    }
}

Hybrid inheritence 

class Mammal extends Animal{
    void swim(){
        System.out.println("can swim");
    }
}
class dog extends Mammal{
    void walk(){
        System.out.println("can walk");
    }
}
class cat extends dog{
    void run(){
        System.out.println("can run");
    }
}


class fish extends Animal {
    void fins(){
        System.out.println("have fins");
    }
}
class shark extends fish{
    void diver(){
        System.out.println("she can dive");
    }
}



class bird extends Animal{
    void fly(){
        System.out.println("can flying ");
    }
}
class parrot extends bird{
    void speak(){
        System.out.println("can speaking");
    }
}

polymorphism -----

method overloading 


public class OOps {

    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(5, 2));
        System.out.println(calc.sum((float)1.5, (float)2.2));
        System.out.println(calc.sum(6, 02, 02));
        
    }
}
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a , float b){
        return a + b ;
    }
    int sum(int a , int b , int c){
        return a + b + c;
    }

}

polymorphism (method overriding)

public class OOps {

    public static void main(String[] args) {
        deer dash = new deer();
        dash.eat();
        
    }
}
class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("Eat Grass");
    }
}


Abstraction 

public class OOps {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        chicken c =  new chicken();
        c.eat();
        c.walk();
        
        mustang Myhorse = new mustang();
    }
}
abstract class Animal{
    Animal(){
    System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void walk(){
        System.out.println("Can walk on 41 legs");
    }
}
class mustang extends Horse{
    mustang(){
        System.out.println("mustang constructor called");
    }
}

class chicken extends Animal{
    void walk(){
        System.out.println("Can walk on 2 legs");
    }
}