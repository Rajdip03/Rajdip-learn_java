class numberformat 
{
    public static void main(String[] args) {

        String h="318";
        int y=Integer.parseInt(h);
        System.out.println(y);
        

        String s="rajdip";

      try 
      {
        int f=Integer.parseInt(s);
        System.out.println(f);
      } 
      catch (Exception e) 
      {
        System.out.println("string not convert into int...yes number type string is convert into int");
      }
  }
}
