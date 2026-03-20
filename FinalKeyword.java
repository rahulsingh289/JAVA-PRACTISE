// Final Classes - Example

final class Animal {
    void eat() { System.out.println("Animal eats");
   }
}
// class Dog extends Animal { } // ❌ Error: cannot inherit final class

public class FinalKeyword  {
    public static void main(String args[]) {
        Animal a = new Animal();
        a.eat();
    }
}