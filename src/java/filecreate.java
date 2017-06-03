import java.io.*;
public class filecreate 
{
    public static void main(String[] args)
    {
        try
        {
            File f=new File("abc.txt");
            boolean d=f.createNewFile();
            if(d)
                System.out.println("Done");
            else
                System.out.println("File already in disk");
        }
        catch(Exception e)
        {
            
        }
    }
    
}
