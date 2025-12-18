class A
{
    int a; int b;
    A()
    {
        a=3; b=8;
        System.out.println(a+" "+b);
    }
    A(A ref)
    {
      a=ref.a;
      b=ref.b; 
      System.out.println(a+" "+b); 
    }
}
class copy
{
    public static void main(String[] args) {
    A r= new A();   
    A r2= new A(r);
    }
    
}