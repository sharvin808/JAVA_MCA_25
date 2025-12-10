/*Create a program for adding, subtracting, multiplying and dividing two numbers using object-oriented concepts*/

import java.io.*;
import java.util.*;

class Calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int subtract(int a, int b)
	{
		return a-b;
	}
	public int mult(int a,int b)
	{
		return a*b;
	}
	public double divi(int a,int b)
	{
		if(b == 0)
		{
			System.out.println("Error: Can't divide a number using zero");
			return 0;
		}
		else
		{
			return a/b;
		}
	}
}
public class Program_11
{
	public static void main(String args[])
	{
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers to do arithmetic operation:");
		a = s.nextInt();
		b = s.nextInt();
		Calculator cal = new Calculator();
		System.out.println("---Result---");
		System.out.println("Addition:"+cal.add(a,b));
 		System.out.println("Subtraction:"+cal.subtract(a,b));
		System.out.println("Multiplication:"+cal.mult(a,b));
		System.out.println("Division:"+cal.divi(a,b));
	}
}
