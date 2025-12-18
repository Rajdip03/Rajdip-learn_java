class A
{
     int x;   int y; String  z;
    A(int a, int b, String name)
    {
       x=a;  y=b; z=name;
    }
    A(int c, int d)
    {
      System.out.println(c+" "+d);
    }
    void show()
    {
      System.out.printf(x+" "+y+" "+z);
    }
}
class d
{
    public static void main(String[] args) {
     A ref= new A(3,8,"Rajdip");
     A r= new A(80,90); 
     ref.show();   
    }
    
}
