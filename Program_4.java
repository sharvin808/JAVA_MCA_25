/*Implement searching and sorting elements in an Array*/

import java.util.*;
import java.io.*;

class Program_4
{ 
	int n,i,j;
	int arr[];

	public int[] readArray()
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the size of array:");
	  n = s.nextInt();
	  arr = new int[n];
	  System.out.println("Enter" + n + "elements:");
	  for(i=0; i<n; i++)
	  {
		arr[i] = s.nextInt();
	  }
	  return arr;
	}
	
	public void disp(int arr[])
	{
	  System.out.println("The elements in the array is:");
	  for(i=0;i<n;i++)
	  {
	  	System.out.println(arr[i]);
	  }
	}
	public void linearsearch(int arr[],int a)
	{
	  int flag=0;
	  System.out.println("Linear Search:");
	  for(i=0;i<n;i++)
	  {
	  	if(arr[i] == a)
	  	{
	  	  System.out.println(a+" found from the array at position" +i);
	  	  flag = 1;
	  	  break;
	  	}
	  }
	  if(flag == 0)
	  {
	    System.out.println("Element not found in the array:");
	  }
	}
	public void bubblesort(int arr[])
	{
	  int temp = 0;
	  for(i=0;i<n;i++)
	  {
	  	for(j=0;j<n-1;j++)
		{
		  if(arr[j]>arr[j+1])
		  {
		    temp = arr[j];
		    arr[j] = arr[j+1];
		    arr[j+1] = temp;
		  }
		}
	  }
	}
	public static void main(String args[])
	{
	  int a;
	  Program_4 obj = new Program_4();
	  Scanner s = new Scanner(System.in);
	  int arr[] = obj.readArray();
	  System.out.println("\nOriginal Array\n");
	  obj.disp(arr);
	  System.out.println("Enter the element to search:\n");
	  a = s.nextInt();
	  obj.linearsearch(arr,a);
	  obj.bubblesort(arr);
	  System.out.println("Array after sorting:");
	  obj.disp(arr);
	}
}
	  
	  