import java.util.*;
import java.lang.*;
import java.io.*;
public class XtoY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int n1=s1.length();
		int n2=s2.length();
		int n=n1;
		int m=n2;
		int count=0;
		if(n2<n1)
		{
			n=n2;
		}
		for(int i=0;i<n;i++)
		{
			if(ch1[i]==ch2[i])
			{
				count++;
			}
		}
		System.out.println(m-count);
	}
}
