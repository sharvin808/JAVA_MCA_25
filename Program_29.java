import java.util.*;
class SquareThread extends Thread
{
    int num;
    SquareThread(int num)
    {
        this.num = num;
    }
    public void run()
    {
        System.out.println("Square of "+num+" is "+(num * num));
    }
}
class CubeThread extends Thread
{
    int num;
    CubeThread(int num)
    {
        this.num = num;
    }
    public void run()
    {
        System.out.println("Cube of "+num+" is "+(num * num * num));
    }
}
public class Program_29 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        SquareThread t1 = new SquareThread(num);
        CubeThread t2 = new CubeThread(num);
        t1.start();
        t2.start();
    }    
}
