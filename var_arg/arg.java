class arg 
{
    void add(int...a)     
    {
        int sum=0;
        for(int x:a)
        {

           sum=sum+x;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        arg r=new arg();
        r.add(1);
        r.add(3);
        r.add(10,20); 
        r.add(3,8,12);
        r.add(80,90,98,99);  
    }
}
