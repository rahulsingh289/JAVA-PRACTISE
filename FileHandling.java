import java.io.*;

// File Creation

/*
class Z
{
	public static void main(String args[]) 
	{  
		File f = new File("one.txt");
		try{	
		if(f.createNewFile())
			System.out.println("File created ");
		else
			System.out.println("File Already Exist ");
		}
		catch(IOException e)
		{
			System.out.println("Exception Handled ");
		}

	}
}


// Writing to a File

class Z 
{
    public static void main(String args[]) 
	{
        try 
	{
            FileWriter f = new FileWriter("one.txt");
            f.write("File Handling Operations in Java");
            f.close();
        } 
	catch (Exception e)
	{
            System.out.println("No write operation");
        }
    }
}

// File Properties and Deletion


class Z
{
	public static void main(String args[]) 
	{  
		File f = new File("one.txt");
			if(f.exists())
			{
				System.out.println("File Name " + f.getName());
				System.out.println("File Path " + f.getAbsolutePath());
				System.out.println("File Writable " + f.canWrite());
				System.out.println("File Readable " + f.canRead());
				System.out.println("File Length " + f.length());
				System.out.println("File Length " + f.delete());
			}
			else
				System.out.println("File not available");
			}
}

*/

// Copying Files Using Streams

class Z
{
	public static void main(String args[]) throws IOException 
	{
        	try(FileInputStream inp = new FileInputStream("one.txt");
             	FileOutputStream out = new FileOutputStream("two.txt")) 
		{

	         	int c;
            		while((c = inp.read()) != -1) 
			{
                		out.write(c);
            		}
        	}
    	}
}


// Copying Files Using Readers/Writers (Character Stream)


/*
class Z
{
	public static void main(String args[]) throws IOException 
	{
        try (FileReader inp = new FileReader("one.txt");
             FileWriter out = new FileWriter("bb.txt")) 
	{

            int c;
            while ((c = inp.read()) != -1) {
                out.write(c);
            }
        }
    }
}

*/


