import java.util.*;
import java.lang.*;
import java.io.*;
public class Candiess
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=1,temp,b=1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=1;i<n;i++)
		{
			if(a[i]>a[i-1])
			{
				b++;
			}
			count=count+b;
		}
		System.out.println(count);
	}
}
