import java.util.*;
class Logical 
{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter your number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Logical operator AND");

        // System.out.println((10>8) && (8>2));
        // System.out.println((2<1) && (2>1));
        
        System.out.println((a>b) && (a>b));
        System.out.println((a<b) && (a>b));

        System.out.println("Logical operator OR");
        System.out.println((a>b) || (a>b));
        //System.out.println((2<1) || (2>1));
        
        System.out.println("Logical operator NOT");
        System.out.println(! (a>b));
       // System.out.println(! (2<1));
    }
}
    



    
