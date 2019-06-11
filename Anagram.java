import java.util.*;
import java.lang.*;
import java.io.*;
public class Anagram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="dhoni";
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		int n=s.length();
		int n1=5,count=0;
		if(n==n1)
		{
			for(int i=0;i<n1;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(ch1[i]==ch[j])
					{
						count++;
						j=n;
					}
				}
			}
			if(count==n)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		else
		{
			System.out.println("no");
		}
	}
}
