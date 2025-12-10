/*A function takes an integer argument and returns the reverse of the same. Another function takes an integer argument and returns true or false if the number is a palindrome, using the above function.*/

import java.io.*;
import java.util.*;

class Program_8
{
	public static int reverse(int n)
	{
		int rev = 0,dig;
		while(n>0)
		{
			dig = n % 10;
			rev = rev * 10 + dig;
			n = n / 10;
		}
		return rev;
	}
	public static boolean palindrome(int n)
	{
		return n == reverse(n);
	}
	public static void main(String args[])
	{
		int n,revNum;
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter a number to check palindrome:");
		n = s.nextInt();
		revNum = reverse(n);
       		System.out.println("Reversed number: " + revNum);
        	if (palindrome(n))
            		System.out.println(n + " is a Palindrome.");
        	else
            		System.out.println(n + " is NOT a Palindrome.");
	}
}

		
			