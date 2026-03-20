import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // next , nextLine , nextInt , 
        // nextByte , nextDouble , nextBoolean , nextShort , nextLong
        System.out.println(input);
        sc.close();
    }
}

