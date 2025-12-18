public class string {
    public static void main(String[] args) {
        //String literal
//            String name="Rajdip";
//            String name2="Rajdip";

//            name.concat("Mondal");
//            System.out.println(name); 

//            name=name.concat("Mondal");
//            System.out.println(name);
// // string object(new)
//            String school = new String ("Sarisha R.K Mission Siksha Mandir");
//            System.out.println(school.concat(" "+"wow"));
//compare of string
// if u use == then it check type of object creation means its create literal or new.
// if u use .equals()--->then its just check object means value(string value), not checking type of creation.

        String name ="shiva";
        String name2 =new String("shiva");
           if (name.equals(name2) ) 
           {
            System.out.println("equal");
           }
           else 
           {
             System.out.println(" not equal");
           }

    }
}
