/*Implement a Java program to pass an array in different ways.*/

import java.io.*;
import java.util.*;

class Program_5
{
	public static void dispArray(int arr[])
	{
	  int i;
	  int n = arr.length;
	  System.out.println("\nDisplaying the array elements\n");
	  for(i=0;i<n;i++)
	  {
	    System.out.println(arr[i]);
	  }
	}
	public static void printWithSize(int arr[],int n)
	{
	  int i;
	  System.out.println("Printing array with its size");
	  for(i=0;i<n;i++)
	  {
	    System.out.println(arr[i]);
	  }
	}
	public static void printElement(int element)
	{
	  System.out.println("Specific element passed:"+element);
	}
	public static void main(String args[])
	{
	  int i,n,element,arr[];
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the size of the array:");
	  n = s.nextInt();
	  arr = new int[n];
	  System.out.println("Enter " +n+ "element");
	  for(i=0;i<n;i++)
	  {
	    arr[i] = s.nextInt();
	  }
	  dispArray(arr);
	  printWithSize(arr,n);
	  System.out.println("Enter the index to print element");
	  element = s.nextInt();
	  if(element>0 && element<n)
	  {
	    printElement(arr[element]);
	  }
	  else
	  {
	    System.out.println("Index not found");
	  }
	}
}
	  