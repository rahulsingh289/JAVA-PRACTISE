   import java.io.*;

public class CreateFile {
    public static void main(String args[]) {
        File obj = new File("myfile.txt");
        try {
            if (obj.createNewFile()) {
                System.out.println("File is Created");
            } else {
                System.out.println("File already Exists");
            }
        } catch (IOException e) {
            System.out.println("File Exception Handled");
        }
    }
}