


public class ExceptionHandling {
    
}


class Z {
    public static void main(String[] args){
        try {
            int x = 10 , y = 0;
            System.out.println("Result"+ (x/y));
            int a[] = {1,2,3};
            a[6]=10;

        } catch (ArithmeticException ob) {
            System.out.println("Divison by zero")
;
        }
        catch(Exception ob){
                System.out.println("ArrayIndexOutOfBound");
        }
        finally{
            System.out.println("Last Line!!! ");
        }
    }
}





/* import java.io.*;

class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Display Number: " + num);
    }
} */
