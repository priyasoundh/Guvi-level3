import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_pair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==k)
				{
					count++;
				}
			}
		}
		if(count>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
