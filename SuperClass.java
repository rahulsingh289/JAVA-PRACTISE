class Animal {        // Superclass
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {   // Subclass
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SuperClass {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // own method
    }
}