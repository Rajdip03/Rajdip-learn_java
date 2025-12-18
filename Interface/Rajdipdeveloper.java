// onword jdk 1.8 interface can contain default and static method
interface jdk
{
    public void webdesign();
    default void webdevelopment() //default method can implement in interface and can implement in implementing class
    {
        String technology,learn;
        technology=("Technology use for Webdelopmnt: html , css , Javascript , React js(framework)");
        learn=("need Backend Development(node js), Database--My sql, Mongodb");
        System.out.println(technology);
        System.out.println(learn);
    }   
    public static void Database() //this interface static method can implement only in interface(not override )
    {
        System.out.println("Database use : My sql and Mongodb");
    }
}
class Rajdipdeveloper implements jdk
{
    @Override
    public void webdesign()
    {
        System.out.println("client demand is: Make unnique web design ");
    }
    public static void main(String[] args) {
        Rajdipdeveloper r=new Rajdipdeveloper();
        r.webdesign();
        r.webdevelopment();
        jdk.Database(); //call through interface name
    }
}