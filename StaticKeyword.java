


/* 
class Student{
    String name;
   static String School;   //static variable

}

public class StaticKeyword {
    public static void main(String args[]){
         Student.School = "ABC";   // static method , variables , we can acces them through class names 
       
         Student s1 = new Student();
         s1.name = "tony";
         System.out.println(Student.School);


    }
} */





class Student{
    String name;
   static String School;
   public static void changeSchool(){      // Static Function
    School = "newschool";
   }

}

public class StaticKeyword {
    public static void main(String args[]){
         Student.School = "ABC";   // static method , variables , we can acces them through class names 
       
         Student s1 = new Student();
         s1.name = "tony";
         System.out.println(Student.School);


    }
}



