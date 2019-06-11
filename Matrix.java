import java.util.*;
import java.lang.*;
import java.io.*;
public class Matrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
				if(a[i][j]==0)
				{
					b[i][j]=1;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(b[i][j]==1)
				{
					for(int k=0;k<n;k++)
					{
						a[k][j]=0;
					}
					for(int k=0;k<m;k++)
					{
						a[i][k]=0;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]);
				if(j<m-1)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
