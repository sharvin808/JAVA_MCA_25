import java.util.*;
class Program_6
{
	public static void sumofmatrix()
	{
		int a[][],b[][],sum[][],r,c,i,j;
		Scanner	s = new Scanner(System.in);
		System.out.println("Enter the no of r & c");
		r = s.nextInt();
		c = s.nextInt();
		a = new int[r][c];
		b = new int[r][c];
		sum = new int[r][c];
		System.out.println("First matrix");
 		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println("Enter a["+i+"]["+j+"]");
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Second matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println("Enter b["+i+"]["+j+"]");
				b[i][j] = s.nextInt();
			}
		}
		System.out.println("Sum of two matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(sum[i][j] +"\t");
			}
			System.out.println("");
		}	
	}
    public static void prodofmatrix()
	{
		int a[][],b[][],mul[][],r1,c1,r2,c2,i,j,k;
		Scanner	s = new Scanner(System.in);

		System.out.println("Enter the no of r & c for first matrix");
		r1 = s.nextInt();
		c1 = s.nextInt();
		a = new int[r1][c1];

		System.out.println("Enter the no of r & c for second matrix");
		r2 = s.nextInt();
		c2 = s.nextInt();
		b = new int[r2][c2];

		if(c1 != r2)
		{
			System.out.println("Multiplication is not possible");
			return;
		}

		mul = new int[r1][c2];
		System.out.println("First matrix");
 		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.println("Enter a["+i+"]["+j+"]");
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Second matrix");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.println("Enter b["+i+"]["+j+"]");
				b[i][j] = s.nextInt();
			}
		}
		System.out.println("Product of two matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				for(k=0;k<c1;k++)
				{
					mul[i][j] = a[i][k] * b[k][j];
				}
			}
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(mul[i][j] +"\t");
			}
			System.out.println("");
		}	
	}
    public static void main(String args[])
    {
        System.out.println("Sum of Two Matrix");
        sumofmatrix();
        System.out.println("Multiplication of Two Matrix");
        prodofmatrix();

    }
}