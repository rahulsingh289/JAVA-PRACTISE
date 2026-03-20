
// import java.util.*;

// public class PassByReference {

//     static void change(int arr[]){
//         arr[0] = 100;
//     }

//     public static void main(String args[]){
//         int arr[] = {10};

//         change(arr);

//         System.out.println(arr[0]);
//     }
// }



class Number {
    int value;
}

public class PassByReference {

    static void change(Number n){
        n.value = 50;
    }

    public static void main(String args[]){
        Number obj = new Number();
        obj.value = 10;

        change(obj);

        System.out.println("Value after method call: " + obj.value);
    }
}


// import java.util.*;

// class X{
// int b;
// }

// public class PassByReference {
// public static void main(String args[]){

// X obj = new X();
// obj.b=15;
// display(obj);
// System.out.println(obj.b);

// }

// static void display(X n){
//     n.b=10;
// }
// }


