import java.util.*;
import java.lang.*;
import java.io.*;
public class Min_max
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
		int min=a[0],max=a[0],k=0,l=0;
		for(int i=1;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				k=i;
			}
			if(min>a[i])
			{
				min=a[i];
				l=i;
			}
		}
		System.out.println((l+1)+" "+(k+1));
	}
}
