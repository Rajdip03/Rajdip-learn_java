public class propogation 
{
    public static void main(String[] args) {
        m1();
    }
    public static void m1()
    {
        try
        {
             m2();
        } 
        catch (Exception e) 
        {
           System.out.println("handling exception");
        }
    }
    public static void m2() throws ArithmeticException
    {
        //throw new Exception();
        System.out.println(10/0);
    }
}