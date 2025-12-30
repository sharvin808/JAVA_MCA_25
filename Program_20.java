import java.util.*;

interface ishape
{
    void draw();
    void move();
}
class circle implements ishape
{
    public void draw()
    {
        System.out.println("Drawing circle");
    }
    public void move()
    {
        System.out.println("Moving circle");
    }
}
class rectangle implements ishape
{
    public void draw()
    {
        System.out.println("Drawing rectangle");
    }
    public void move()
    {
        System.out.println("Moving rectangle");
    }
}

public class Program_20 
{
    public static void main(String args[])
    {
        int ch;
        ishape i;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("\n1.Circle\n 2.Rectangle\n 3.Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    i = new circle();
                    i.draw();
                    i.move();
                    break;
                case 2:
                    i = new rectangle();
                    i.draw();
                    i.move();
                    break;
                case 3:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch != 3);
    }

}
