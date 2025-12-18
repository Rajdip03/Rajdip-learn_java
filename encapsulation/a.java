class t  
{
   private int b,g,s;//data hiding
   public int getshow()
   {
    b=3; g=1;
    s=b+g;
    return s;
   }
   
} 
class a
{ 
    public static void main(String[] args) {
        t r=new t();
        System.out.println(r.getshow());
        
    }
}