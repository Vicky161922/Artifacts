import java.io.*;
public class filewrite 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the file name to create : ");
        String file_name=in.readLine();
        File file=new File(file_name);
        boolean exist=file.createNewFile();
        if(!exist)
        {
            System.out.println("File already exists.");
            System.exit(0);
        }
        else
        {
            FileWriter fstream=new FileWriter(file_name);
            BufferedWriter out=new BufferedWriter(fstream);
            System.out.println("Enter String");
            out.write(in.readLine());
            out.close();
            System.out.println("File Created successfully");
        }
    }
    
}
