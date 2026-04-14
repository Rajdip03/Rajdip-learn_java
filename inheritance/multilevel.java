class parimal //super class
{
void show()
{
    System.out.println("Rajdip is a web Developer");
}
}
class swapan extends parimal
{
void disp()
{
    System.out.println("Rajdip is a hardwork person");
}
}
class Rajdip extends swapan
{
void see()
{
    System.out.println("Rajdip is a spiritual person");
}
}
class multilevel extends Rajdip
{
    public static void main(String[] args) {
        multilevel r = new multilevel();
        r.show(); r.disp(); r.see();
    }
}
