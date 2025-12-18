class t  
{
   private int value;//data hiding
   public int setValue(int b)
   {
     value=b;
     return value;
   }
   public int getValue()
   {
     
     return value;   
   }
   
} 
class f
{ 
    public static void main(String[] args) {
        f r=new f();
        r.setValue(3);
        System.out.println(r.getValue());   
    }
}
