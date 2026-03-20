  
  // Plymorphism - 1- Method Overloading (Compile Time) , 2- Method Overriding (Runtime)


      // method overloading (compile time polymorphism)

  /* import java.util.*;

    class Student {
    int age;
    String name;

    public void printInfo(String name){
 System.out.println(name);
    }
    public void printInfo(int age){
         System.out.println(age);
    }
    public void printInfo(String name , int age ){
        System.out.println(name+ " "+age);
    }
}
public class Polymorphism {
    public static void main(String args[]){

       Student s1 = new Student();
       s1.age=55;
       s1.name="aman";
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name,s1.age);

    }
    
} */


// Method Overriding (Runtime Polymorphism)


// Base class (Parent)
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Child)
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Animal();  // Parent class reference & object
        a1.sound();                // Calls Animal's method

        Dog d1 = new Dog();        // Child class reference & object
        d1.sound();                // Calls Dog's overridden method

        Animal a2 = new Dog();     // Parent reference, Child object
        a2.sound();                // Runtime decides: calls Dog's method
    }
}





