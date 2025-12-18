import java.io.*;

public class fileinfo 
{
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Rajdip\\OneDrive\\Desktop\\Lion.pdf");
        if(f.exists())
        {
            System.out.println("file name is"+ f.getName());
            System.out.println("file location is"+ f.getAbsolutePath());
            System.out.println("file size is"+ f.length());
            System.out.println("file is readale"+ f.canRead());
            System.out.println("file is writtable"+ f.canWrite());
        }
        else
        {
            System.out.println("file is does not exit");
        }
    }
}
