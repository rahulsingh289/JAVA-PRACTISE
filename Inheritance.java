
// inheritance - 1- Single level inheritance , 2- multilevel , 3- multiple(through interfaces)  , 4- hierrarchical , 5- Hybrid


// Basic Example of inheritance

class Shape{
    String color;
}

class Triangle extends Shape{

}
public class Inheritance {
    public static void main(String args[]){
        Triangle s1 = new Triangle();
        s1.color="blue";
    }
} 



// Single level Inheritance

/* class Shape{
    String color;

    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{

    public void triangleArea(int l , int h){
        System.out.println("Area of Triangle: " + (l * h) / 2);
    }

}

public class Inheritance {
    public static void main(String args[]){

        Triangle t1 = new Triangle();

        t1.color = "Blue";   // inherited variable
        System.out.println("Color: " + t1.color);

        t1.area();           // inherited method
        t1.triangleArea(10,5); // child class method
    }
}
*/



/* class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class Inheritance{
    public static void main(String args[]){
        Dog d1 = new Dog();

        d1.eat();   // inherited method
        d1.bark();  // own method
    }
}  */









// Multilevel Inheritance 

/* class Shape{
    String color;

    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{

    public void area(int l , int h){
        System.out.println("Area of Triangle: " + (l * h) / 2);
    }
}

class EquilateralTriangle extends Triangle{

    public void area(int a){
        System.out.println("Area of Equilateral Triangle: " + (a * a * 1.732) / 4);
    }
}

public class Inheritance {
    public static void main(String args[]){

        EquilateralTriangle t1 = new EquilateralTriangle();

        t1.color = "Blue";
        System.out.println("Color: " + t1.color);

        t1.area();        // method from Shape
        t1.area(10,5);    // method from Triangle
        t1.area(6);       // method from EquilateralTriangle
    }
} */








// Hybrid Inheritance

  /*  
  
  
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class (multilevel part)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Interface (multiple inheritance part)
interface Pet {
    void play();
}

// Final child class
class Puppy extends Dog implements Pet {

    public void play() {
        System.out.println("Puppy plays");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
} */






// Hierrarchical Inheritance


  /* class Shape {
    String color;

    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {

    public void triangleArea(int l, int h) {
        System.out.println("Area of Triangle: " + (l * h) / 2);
    }
}

class Circle extends Shape {

    public void area(int r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

public class Inheritance {
    public static void main(String args[]) {

        Triangle t1 = new Triangle();
        t1.triangleArea(10, 5);

        Circle c1 = new Circle();
        c1.area(7);
    }
} */
