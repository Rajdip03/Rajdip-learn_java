import java.util.Scanner;

public class elseifladder 
{
     public static void main(String[] args) {
    int marks;
    System.out.println("Enter a Number");
    Scanner sc=new Scanner(System.in);
    marks=sc.nextInt();
    if(marks>80)
    {
        System.out.println("Good student");
    }
    else if(marks>90)
    {
        System.out.println("topper");
    }
    else 
    {
        System.out.println("middle order student");
    }

  }
}  

  

