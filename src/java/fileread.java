import java.io.*;
public class fileread 
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fstream=new FileInputStream("xy.txt");
            DataInputStream in=new DataInputStream(fstream);
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            String strline;
            while((strline=br.readLine())!=null)
            {
                System.out.println(strline);
            }
            //Close the input stream
            in.close();
        }
        catch(Exception e)
        {
            //Catch exception if any
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
