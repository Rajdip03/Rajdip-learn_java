class job
{
    int c=3; int b=5; int a=c+b;
    void show()
    {
        System.out.println(a);
    }
}
class Test
{
    public static void main(String[] args) {
        job r= new job();
        r.show();
    }
}