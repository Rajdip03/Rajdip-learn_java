interface client1
{
  public void Webdesign();     
}
interface client2
{
  public void Webdevelop();     
}
class developer implements client1, client2
{
      @Override
      public void Webdesign()
      {
      System.out.println("dynamic and unique");  
      }
      @Override
      public void Webdevelop()
      {
       System.out.println("using HTML,CSS,Javascirpt");  
      }
   public static void main(String[] args) {
      developer r=new developer();
      r.Webdesign(); 
      r. Webdevelop(); 
   }
}
