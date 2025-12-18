import java.io.*;
public class filewrite 
{
    public static void main(String[] args) throws IOException{
       
            FileWriter f=new FileWriter("C:\\Users\\Rajdip\\OneDrive\\Desktop\\Lion.pdf");
            f.write("java is my fevorite programming language");
         
            System.out.println("file is written");
    }
}
