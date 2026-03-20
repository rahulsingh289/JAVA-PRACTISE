public class Typepromotion {
    public static void main(String []args){
        byte b =5;
        b = (byte)(b*2); // gives no error beacuse it is typecasted.

        System.out.println(b);
    }
}


// byte , short or char into int
// long , float or double into largest possible datatype among all
