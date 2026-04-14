import A;

package inheritance;
class A
{ int a; int b;  static int c;
    {
        a=3; b=8;
        System.out.println(a+" "+b+" "+c);
    }
    static{
        c=80;
        System.out.println(c);
    }
}
class instance
{
    public static void main(String[] args) {
       A r= new A(); 
    }
}