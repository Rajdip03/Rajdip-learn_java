// jdk 1.9 onword ineterface can contain private method and we writting this private method static and non static also
interface jdkk
{
    public default void use()
    {
        disp();
        //show();
    }
     public static void add()
    {   
         show();
     }
    private void disp()
     {
       System.out.println("input from my client for webdesign");  
     }
    private static void show()
    {
        System.out.println("I am a the wrold best computer seicence engineer");
    }  
}
class kiron implements jdkk
{
    public static void main(String[] args) {
     jdkk r=new kiron();
     r.use(); 
     jdkk.add();  
    }
}
    

