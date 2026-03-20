
public class MethodCallStack {

    static void first(){
     second();
   System.out.println("First");
    }
    static void second(){
        System.out.println("Second");
    }
    public static void main(String args[]){
             first();
    }

}

// it follows stack and second will pe pop out first  , so the first ans will be second()