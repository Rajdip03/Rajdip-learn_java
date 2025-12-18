class arithmetic 
{
    public static void main(String[] args) {
        // int d,f,g;
        //   d=10;
        //   f=10;
        //   g=d*f;
        //   System.out.println(g);

        try 
        {
            int d,f,g;
            d=10;
            f=10;
            g=d*f;
            System.out.println(g);

            int a,b,c;
            a=8;
            b=0;
            c=a/b; // this is arithmetic exception we cant devided by 0
            System.out.println(c); 
        }
        catch(Exception e)
        {
            System.out.println("we cant devided by 0");
        }
    }
}
