import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_index
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int a[]=new int[n];
		int u,v;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<q;i++)
		{
			u=sc.nextInt();
			v=sc.nextInt();
			int count=0;
			for(int j=u-1;j<v;j++)
			{
				count=count+a[j];
			}
			System.out.println(count);
		}
	}
}
