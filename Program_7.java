/*A function takes two integer arguments and returns the maximum. Use this function to find the maximum of three numbers*/

import java.util.*;
import java.io.*;

class Program_7
{
	public static int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static void main(String args[])
	{
		int a,b,c,maxofThree;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		maxofThree = max(max(a,b),c);
		System.out.println("Maximum of three number is:"+maxofThree);
	}
}