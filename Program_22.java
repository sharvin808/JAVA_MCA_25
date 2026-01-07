import java.util.*;

class InvalidAge extends Exception
{
    public InvalidAge(String msg)
    {
        super(msg);
    }
}
public class Program_22 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.println("Enter your age:");
            int age = s.nextInt();
            if(age < 18)
            {
                throw new InvalidAge("Age should be above 18");
            }
            System.out.println("Valid age.Access granted");

        }
        catch(InvalidAge e)
        {
            System.out.println("Exception caught:"+e.getMessage());
        }
    }    
}
