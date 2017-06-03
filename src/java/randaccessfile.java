import java.io.*;
public class randaccessfile 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter File Name");
        String str=in.readLine();
        File file=new File(str);
        if(!file.exists())
        {
            System.out.println("File does not exists.");
            System.exit(0);
        }
        try
        {
            //Open the file for both raeding and writing
            RandomAccessFile rand=new RandomAccessFile(file,"rw");
            rand.seek(file.length());   //seek to end of file
            rand.writeBytes("IBM India");  //write end of file
            rand.close();
            System.out.println("Write Successfully");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
