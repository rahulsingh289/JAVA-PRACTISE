
// copy constructor in java 
class parameterizedconst{
    int x;
    parameterizedconst(parameterizedconst s2){
            this.x=s2.x;
    }
    parameterizedconst(){

    }
}
public class Constructors{
public static void main(String args[]){
     parameterizedconst s1 = new parameterizedconst();
      parameterizedconst s2 = new parameterizedconst(s1);
     System.out.println("Value of x: " + s2.x);

}
}