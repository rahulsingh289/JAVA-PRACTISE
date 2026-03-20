    abstract class Animal{  // irrelavant , 
    abstract void walk();
    public void eat(){     // can have non-abstract methods

      }
   }
    class Horse extends Animal{
        public void walk(){
          System.out.println(".(Walk on 4 Legs)");
    }
    }
    class Chickens extends Animal{
         public void walk(){
          System.out.println(".(Walk on 2 Legs)");
    }
    }
  public class Abstraction {
    public static void main(String args[]){
            Horse horse = new Horse();
            horse.walk();
    }
}
