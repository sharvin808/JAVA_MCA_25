class EvenThread extends Thread
{
    int n;
    EvenThread(int n)
    {
        this.n = n;
    }
    public void run()
    {
        System.out.println("Even Numbers:");
        for(int i = 2;i <= n;i +=2)
        {
            System.out.println(i);
        }
    }
}
class OddThread extends Thread
{
    int n;
    OddThread(int n)
    {
        this.n = n;
    }
    public void run()
    {
        System.out.println("Odd Numbers:");
        for(int i = 1;i <= n;i +=2)
        {
            System.out.println(i);
        }
    }
}
public class Program_27 
{
    public static void main(String args[])
    {
        int n = 10; 
        EvenThread t1 = new EvenThread(n);
        OddThread t2 = new OddThread(n);
        t1.start();
        t2.start();
    }
}
