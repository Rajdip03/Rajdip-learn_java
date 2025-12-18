// for primitive(like int,double) return type are not allowed in covariant return type
//covariant return type are  allowed for object return type
//
class a
{
   a show() //return type is class type(a...class name)
    {
        System.out.println("Rajdip");
        return this; //this refer current object--- new a()... when our returntype is (class) then we use "this" as a return
    }
    int disp() // for primitive(like int,double) return type are not allowed in covariant return type
    {
        System.out.println("wow");
        return 80;
    }
}
class covariant extends a
{
    @Override
    covariant show() //return type is class type(covariant...class name)
    { 
        super.show(); super.disp();
        System.out.println("dicipline");
        return this;  //tis refer current object--- new covaiant()...when our returntype is (class) then we use "this" as a return
    }
    int disp() // for primitive(like int,double) return type are not allowed in covariant return type

    {
        System.out.println("hello");
        return 100;
    }

    public static void main(String[] args) {
        covariant r=new covariant();
        r.show(); r.disp();
    }
}


