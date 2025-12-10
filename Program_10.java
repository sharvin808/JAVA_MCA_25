/*Display from n - 1 and 1-n using recursive functions. */

import java.util.Scanner;

public class Program_10 {
    public static void printnto1(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n+" ");
        printnto1(n-1);
    }
    public static void print1ton(int n)
    {
        if(n == 0)
        {
            return;
        }
        print1ton(n-1);
        System.out.println(n+" ");
    }
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit number");
        n = s.nextInt();
        System.out.println("--Displaying from n to 1--");
        printnto1(n);
        System.out.println("--Displaying from 1 to n--");
        print1ton(n);
    }
}
