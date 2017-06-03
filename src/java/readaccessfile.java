import java.io.*;
public class readaccessfile 
{
    public static void main(String[] atrgs)throws IOException
    {
        File file=new File("Ram.txt");
        try
        {
            //Open the file for both reading and writing
            RandomAccessFile rand=new RandomAccessFile(file,"r");
            int i=(int)rand.length();
            System.out.println("Length: "+i);
            rand.seek(12);  //seek to start point of file
            for(int ct=0;ct<i;i++)
            {
                byte b=rand.readByte();
                System.out.println((char)b);  //read the character
            }
            rand.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
