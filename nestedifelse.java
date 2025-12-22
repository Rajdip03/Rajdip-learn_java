public class nestedifelse 
{
    public static void main(String[] args) {
        int a=10,b=20,c=8;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is greter then c");
            }
            else 
            {
                System.out.println("c is greter then a");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is grater then c");
            }
            else 
            {
                System.out.println("c is greter then b"); 
            }

        }
    }
    
}
