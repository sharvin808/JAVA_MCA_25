class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Thread runnning:"+i);
        }
    }
} 
public class Program_26 
{
    public static void main(String args[])
    {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
