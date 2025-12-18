class a 
{
    public static void main (String[] args) {
        try 
        {
           int a,b,c;
           a=8;
           b=0;
           c=a/b;
           System.out.println(c);
        } 
        catch(Exception e) 
        {
            System.out.println("ArithmeticException");
            try
            {
                String s=null;
                System.out.println(s.toUpperCase());
            }
            catch(Exception o)
            {
             System.out.println("create another try,catch block inside catch block for exception in catch");   
            }
        }
        finally
        {
           System.out.println("always execute");
           
           try
           {
              String f="rajdip";
           int d=Integer.parseInt(f);
           System.out.println(d); 
           }
           catch(Exception g)
           {
               System.out.println("u have to push yourself");
           }
         
        }
    }
}