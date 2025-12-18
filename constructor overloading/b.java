class A
{
    int o; int f;
    A()
    {
        o=1; f=2;
        System.out.println("sum="+" "+ o+f);
    }
    A(int a, int r)
    {
       System.out.println(a+" "+r); 
    }
    A(int x, String y)
    {
        System.out.println(x+" "+y);
    }
}
class b
{
    public static void main(String[] args) {
        A r=new A();
        A r2= new A(3,8);
        A r3= new A(80, "Rajdip");

    }
}