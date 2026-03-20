
import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){

  int[] hello; // declaration 
  hello = new int[35]; // initialization
  int[] numbers = new int[5];   
  
  String[] rahul = {"apple","ball","cat"}; // declaring and initialzing together
     System.out.println("Accesiing elements are: "+ rahul[2]); // accessing elements

     rahul[2]="seeyou";   // modifiying array
     for(int i =0;i<rahul.length;i++){        // accessing through loops
     System.out.println("rahul array numbers are: "+rahul[i]);
     }
     String[] age = new String[50];




     
// now taking input size from the user and elements also
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();
int marks[] = new int[n]; 
for(int i =0;i<n;i++){
    marks[i]=sc.nextInt();
}

for(int i =0;i<n;i++){
    System.out.println(marks[i]);
}

    }
}