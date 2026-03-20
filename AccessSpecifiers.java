// Access Modifiers Example

public class AccessSpecifiers {

    public int a = 10;      // public
    private int b = 20;     // private
    protected int c = 30;   // protected
    int d = 40;             // default

    public static void main(String[] args) {

        AccessSpecifiers obj = new AccessSpecifiers();

        System.out.println(obj.a); // public
        // System.out.println(obj.b); // private (not accessible outside class methods)
        System.out.println(obj.c); // protected
        System.out.println(obj.d); // default
    }
}