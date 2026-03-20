
import java.util.Scanner;

public class CallByValue {
    public static void main(String args[]){
        Scanner rahul = new Scanner(System.in);
        int a = 15;
         display(a);
        System.err.println("sum is: "+a);
    }
static void display(int x){
x = 10;
System.out.println(x);
}
}


// public class CallByValue {

//     static void change(int x) {
//         x = 50;
//     }

//     public static void main(String[] args) {

//         int a = 10;
//         change(a);

//         System.out.println(a);
//     }
// }






// import java.util.*;
// public class CallByValue {
//     public static void main(String args[]){
//         Scanner x = new Scanner(System.in);
//         int a = x.nextInt();
//         int b = x.nextInt();
//        int result= display(a,b);

//         System.out.println(result);
//     }
//     static int display(int y , int z){
// int result = y + z;
// return result;
//     }
// }
