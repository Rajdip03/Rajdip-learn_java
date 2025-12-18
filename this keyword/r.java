class r 
{
  int a=3;
  r(int a)
    {  
     a=a;
    } 
    void show()
    {
        System.out.println(this.a);
    }
  public static void main (String[] args) {
        r s=new r(8);
        s.show(); 
    }
}
