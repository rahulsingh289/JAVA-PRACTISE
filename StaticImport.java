
import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {
        double x = sqrt(16);   // instead of Math.sqrt(16) we have wriiten only sqrt
        double y = pow(2, 3);  // instead of Math.pow(2, 3)
        System.out.println(x + " " + y);
    }
}



// static import allows us to write without the class name prefix