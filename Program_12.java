/*Create a class complex having real and imaginary as data members and provide function for read, display, add and multiply.*/

import java.util.*;
import java.io.*;

class complex
{
	int real,imag;
	public void read()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter real part:");
		real = s.nextInt();
		System.out.println("Enter the imaginary part:");
		imag = s.nextInt();
	}
	public void disp()
	{
		if(imag>=0)
		{
			System.out.println(real+ " + " +imag+ " i ");
		}
		else
		{
			System.out.println(real+ " - " +(-imag)+ " i ");
		}
	}
	public complex add(complex c)
	{
		complex temp = new complex();
		temp.real = this.real + c.real;
		temp.imag = this.imag + c.imag;
		return temp;
	}
	public complex multiply(complex c)
	{
		complex temp = new complex();
		temp.real = (this.real * c.real) - (this.imag * c.imag);
		temp.imag = (this.real * c.imag) + (this.imag * c.real);
		return temp;
	}
}
class Program_12
{
	public static void main(String args[])
	{
		complex c1 = new complex();
		complex c2 = new complex();
		complex sum,product;
		System.out.println("Enter the first number:");
		c1.read();
		System.out.println("Enter the second number:");
		c2.read();
		System.out.println("\nFirst number:");
		c1.disp();
		System.out.println("\nSecond number:");
		c2.disp();
		sum = c1.add(c2);
		product = c1.multiply(c2);
		System.out.print("\nSum=");
		sum.disp();
		System.out.print("\nProduct=");
		product.disp();
	}
}