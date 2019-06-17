import java.util.*;
import java.lang.*;
import java.io.*;
public class Zero
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum,b=100,c=0,d=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum=a[i]+a[j];
				if(Math.abs(sum)<b)
				{
					b=Math.abs(sum);
					c=a[j];
					d=a[i];
				}
			}
		}
		System.out.println(d+" "+c);
	}
}
