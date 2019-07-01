import java.util.*;
import java.lang.*;
import java.io.*;
public class Binary_sort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count,c,d;
		for(int i=0;i<n;i++)
		{
			count=0;
			a[i]=sc.nextInt();
			c=a[i];
			while(c>0)
			{
				d=c%2;
				c=c/2;
				count+=d;
			}
			b[i]=count;
		}
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(b[i]==b[j])
				{
					if(a[j]>a[i])
					{
						temp=a[j];
						a[j]=a[i];
						a[i]=temp;
						temp=b[j];
						b[j]=b[i];
						b[i]=temp;
					}
				}
				else if(b[j]>b[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					temp=b[j];
					b[j]=b[i];
					b[i]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}
