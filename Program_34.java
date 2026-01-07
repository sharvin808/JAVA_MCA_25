class MyThread extends Thread
{
    MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(getName() + " is running with priority " 
                               + getPriority());
        }
    }
}

public class Program_34
{
    public static void main(String args[])
    {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Setting priorities
        t1.setPriority(Thread.MIN_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(Thread.MAX_PRIORITY);   

        t1.start();
        t2.start();
        t3.start();
    }
}
