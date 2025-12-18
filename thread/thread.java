// thread is a predifined class 
// we can achieve this thread via two way 1) extends thead class 2) implements runnable interface
//1) extends thead class
// public class thread extends Thread {
    
//     public void run() // this is predifined method in thread class
//     {
//         for(int i = 1; i<=8; i++)
//         {
//             System.out.println("Rajdip");
//         }
//     }
//     public static void main (String [] args){ // there is two thread 1) main thread 2) t.start()
//         thread t =new thread();
//         t.start(); 
//         for (int i = 1; i <= 8; i++) {
//             System.out.println("tomorrow is my day");
//         }
//     }
// }
//2) implements runnable interface

// public class thread implements Runnable {
    
//     public void run() // this is predifined method in thread class
//     {
//         for(int i = 1; i<=8; i++)
//         {
//             System.out.println("Rajdip");
//         }
//     }
//     public static void main (String [] args){ // there is two thread 1) main thread 2) t.start()
//         thread t =new thread();
//         Thread r = new Thread(t);
//         r.start(); 
//         for (int i = 1; i <= 8; i++) {
//             System.out.println("tomorrow is my day");
//         }
//     }
// }

//Thread scheduler
public class thread extends Thread {
    
    public void run() // this is predifined method in thread class
    {
        String  s = Thread.currentThread().getName();
        try{
            for(int i = 1; i<=8; i++)
            {
            System.out.println(s);
            Thread.sleep(3000);
            }
        }
        catch(Exception e)
        {

        }
    }
    public static void main (String [] args){ // there is 5 thread
        thread t1 =new thread();
        thread t2 =new thread();
        thread t3 =new thread();
        thread t4 =new thread();
       
        t1.setName("Thread one ");
        t2.setName("Thread Two");
        t3.setName("Thread three ");
        t4.setName("Thread four");

         t1.start();
        System.out.println(t1.isAlive()); // to check either my t1 thread is alive or not
         t2.start();

         t3.start();

         t4.start();
         try
         {
            t3.join(); // completely execute
         }
         catch(Exception e)
         {
            
         }
        
        
    }
}
// we can set priority to thread
public class thread extends Thread
{
 public void run() // this is predifined method in thread class
    {
        String  s = Thread.currentThread().getName();
        int n = Thread.currentThread().getPriority();
        
            for(int i = 1; i<=3; i++)
            {
            System.out.println(s);
            
            }
        
    }
    public static void main (String [] args){ // there is 5 thread
        Main t1 =new Main();
        Main t2 =new Main();
        Main t3 =new Main();
        Main t4 =new Main();
       
        t1.setName("Thread one ");
        t2.setName("Thread Two");
        t3.setName("Thread three ");
        t4.setName("Thread four");
         
         
         t1.setPriority(10);
         t2.setPriority(1);
         t3.setPriority(6);
         t4.setPriority(8);
         
         t1.start();
         
         t2.start();

         t3.start();

         t4.start();
        
        
        
    }
}