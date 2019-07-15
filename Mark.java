import java.util.*;
import java.lang.*;
import java.io.*;
public class Mark
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char ch1[]=s1.toCharArray();
		String s2=sc.nextLine();
		char ch2[]=s2.toCharArray();
		int n1=s1.length();
		int n2=s2.length();
		int a=0,b=0,c=0,d=0;
		for(int i=0;i<n1;i++)
		{
			if(ch1[i]=='#')
			{
				a=a+c;
				c=0;
			}
			if(ch1[i]>='0'&&ch1[i]<='9')
			{
				c=(c*10)+Character.getNumericValue(ch1[i]);
			}
		}
		c=0;
		for(int i=0;i<n2;i++)
		{
			if(ch2[i]=='#')
			{
				b=b+c;
				c=0;
			}
			if(ch2[i]>='0'&&ch2[i]<='9')
			{
				c=(c*10)+Character.getNumericValue(ch2[i]);
			}
		}
		if(a>b)
		{
			for(int i=0;i<n1;i++)
			{
				if(ch1[i]!='#')
				{
					System.out.print(ch1[i]);
				}
				if(ch1[i]=='#')
				{
					break;
				}
			}
		}
		else
		{
			for(int i=0;i<n2;i++)
			{
				if(ch2[i]!='#')
				{
					System.out.print(ch2[i]);
				}
				if(ch2[i]=='#')
				{
					break;
				}
			}
		}
	}
}
