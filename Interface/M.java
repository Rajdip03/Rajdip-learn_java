import java.util.*;
interface client 
{
    public void input();
    //public void output();
}
class developer implements client 
{
    @Override
    public void input()
    {
        String name; double salary;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter your name");
        name=r.nextLine();
        System.out.println(name);
        
        System.out.println("Enter your salary");
        salary=r.nextDouble();
        System.out.println(salary);
    }
}
class M 
{
    public static void main (String[] args) {
        developer d=new developer();
        d.input();
    }
}