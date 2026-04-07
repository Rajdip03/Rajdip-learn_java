import java.util.Scanner;

public class simpleif 
{
    public static void main(String[] args) {
    int age;
    System.out.println("Enter your Age");
    Scanner sc=new Scanner(System.in);
    age=sc.nextInt();
    if(age>=18)
    {
        System.out.println("u are eligible for vote");
    }
    System.out.println("U are not eligible for vote");
    }
}
