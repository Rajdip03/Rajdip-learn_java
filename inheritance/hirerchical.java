class parimal //super class
{
    void show()
    {
        System.out.println("Rajdip is a spiritual person");
       
    }
}
class swapan extends parimal
{
    void disp()
    {
        
        System.out.println("Rajdip is a hardwork person");
        
    }
}
class Rajdip extends parimal
{
    void see()
    {
        
        System.out.println("Rajdip is a ias officer");
    }
}
class hirerchical extends parimal
{
    public static void main(String[] args) {
        swapan r = new swapan();
        Rajdip r1 = new Rajdip();
        hirerchical r2 = new hirerchical();
        r.show(); r1.show(); r2.show();
        r.disp(); r1.see();
    }
}
