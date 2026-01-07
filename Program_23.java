import java.util.*;
import java.io.*;

public class Program_23 
{
    static void test() throws ArithmeticException
    {
        try
        {
            int a = 10 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught inside test()");
            throw e;
        }
        finally
        {
            System.out.println("Finally block inside test()");
        }
    }
    public static void main(String args[])
    {
        try
        {
            test();
        }
        catch(ArithmeticException e)
        {
           System.out.println("Exception caught inside main()"); 
        }
        finally
        {
            System.out.println("Finally block inside main()");
        }
    }    
}
