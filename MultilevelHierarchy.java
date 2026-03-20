class Animal {
      void eat() { System.out.println("Animal eats"); }
}

class Mammal extends Animal {
    void walk() { System.out.println("Mammal walks"); }
}

class Dog extends Mammal {
    void bark() { System.out.println("Dog barks"); }
}

public class MultilevelHierarchy {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();   // from Animal
        d.walk();  // from Mammal
        d.bark();  // own method
    }
}