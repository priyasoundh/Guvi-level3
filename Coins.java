import java.util.*;
import java.lang.*;
import java.io.*;
public class Coins
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
		int temp,count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int i=0,b;
		while(k>0&&i<n)
		{
			b=k/a[i];
			k=k%a[i];
			count+=b;
			i++;
		}
		if(k==0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("Not possible");
		}
	}
}
