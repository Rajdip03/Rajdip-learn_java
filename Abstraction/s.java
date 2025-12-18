abstract class a
{ 
    abstract void input();
    void show()
    {
        System.out.println("Rajdip is a software developer");
    }
}
class s extends a
{
    @Override
    void input()
    {
        System.out.println("Rajdip is a dicipline person");
    }
    public static void main(String[] args) {
        a r=new s();
        r.show(); r.input();
    }
}

