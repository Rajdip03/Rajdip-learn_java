interface client
{
    public void webdesign ();
    public void webdevelop();
}
abstract class Rupak implements client
{ 
    
   @Override
   public void webdesign()
   {
       System.out.println("Title is student form fill up"+" "+"header is yellow colour");
   }
}
class Rajdip extends Rupak
{
    @Override
    public void webdevelop()
    {
        System.out.println("This website is implement using frontend(html,css,javascript)"+" "+"framework(React js)");
    }
}
class n
{
    public static void main (String[] args) {
        Rajdip r=new Rajdip();
        r.webdesign();
        r.webdevelop();
    }
}