   import java.io.*;
        public class WriteInFile{
            public static void main(String args[]){
                try(FileWriter f = new FileWriter("one.txt")){
                f.write("File Handling Operations in Java");
                f.close();
            }
            catch(Exception e){
                System.out.println("No Write Operation");
            }
        }
    }


     /* import java.io.*;
       public class WriteInFile{
            public static void main(String args[]){
                try{
                    FileWriter f = new FileWriter("one.txt";
                f.write("File Handling Operations in Java");
                f.close();
            }
            catch(Exception e){
                System.out.println("No Write Operation");
            }
        }
    } */