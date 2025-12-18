class wow
{ 
     int b;
    void show()
    {
         b=8;

    System.out.println(b);
    }
}
class sub extends wow
{
     int b;
    void show()
    {
         b=2;
        super.show();
        super.b=8;
    //System.out.println(super.a+super.b);  
    System.out.println(b);
    }
    public static void main(String[] args) {
      sub r= new sub();
      r.show();  
    }
} 

