
// Interfaces
interface Animal{
    int eyes = 2; // it will be final , public , static , we cant change it
   public void walk();     // method are public and abstract by default

}
   class Horse implements Animal{
   public void walk(){
     System.out.println(".(Walk on 4 Legs)");
     }
}

public class Interfaces {
    public static void main(String args[]){
        
    Horse horse = new Horse();
    horse.walk();
    }
}



// Muiltiple Inheritance - Using Interfaces

/* import java.util.*;
interface Animal{
   public void walk();

}
interface Herbivore{

}
class Horse implements Animal,Herbivore{
 public void walk(){
    System.out.println(".(Walk on 4 Legs)");
   }
}


public class Interfaces {
    public static void main(String args[]){
        
    Horse horse = new Horse();
    horse.walk();
    }
} */






// Implementing Interfaces

/* interface Animal {
    void walk();
    void eat();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
    public void eat() {
        System.out.println("Horse eats grass");
    }
}    */




// Extended Interfaces

/* interface Animal {
    void walk();
}

interface Herbivore extends Animal {
    void eatPlants();
}

class Cow implements Herbivore {
    public void walk() {
        System.out.println("Cow walks slowly");
    }
    public void eatPlants() {
        System.out.println("Cow eats grass");
    }
}        */




// Interface Reference

/*  
// Interface definition
interface Animal {
    void walk();
}

// Class implementing the interface
class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

public class TestInterfaceReference {
    public static void main(String[] args) {

        // Interface reference pointing to a class object
        Animal a = new Horse();  
        a.walk();  // Calls Horse's walk method
    }
}     */

