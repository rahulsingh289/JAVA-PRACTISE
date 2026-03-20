
// Basic example of class and objects

/* import java.util.*;

class student{
    int age;
    String name;

void display(){
System.out.println(age+ " "+ name);
}
}
public class ClassesAndObjects {
 public static void main(String args[]){
    student obj = new student();
    obj.age = 44;
    obj.name = "Rahul";
    obj.display();
 }
} */


// classes and objects and this - current object calling to the method.    it is used to acces instance variables and methods.

   class Student{
    int age ;
   String name;


   static void display(){
    System.out.println("Hello");
   }

   void result(){
    System.out.println(" age and name are :m "+this.age+ " "+this.name);
   }
}
     public class ClassesAndObjects{
       public static void main(String args[]){

       Student obj1 = new Student();
       obj1.age=55;
       obj1.name="rahul";
       obj1.display();

       Student obj2 = new Student();
       obj2.age=99;
       obj2.name="vicky";
       obj2.display();


       obj1.result();
       obj2.result();
    }
}




