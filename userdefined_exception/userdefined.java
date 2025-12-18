class InvalidAgeException extends Exception// for create user defined exception we have to create class of that and must extends super exception
{
    InvalidAgeException(String s)
    {
       System.out.println(s); 
    }
}
class userdefined
{
        public static void vote(int age) throws InvalidAgeException
        {
        if(age<18)
        {
            throw new InvalidAgeException("not eligible");
        }
        else
        {
            System.out.println("Eligible for vote");
        }
        
        }
        public static void main (String[] args) {
         try 
         {
             vote(24); 
         } 
         catch(InvalidAgeException e) 
         {
             System.out.println("handling Exception");
         }
       }
}


