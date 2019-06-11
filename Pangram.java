import java.util.*;
import java.lang.*;
import java.io.*;
public class Pangram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int n=s.length();
		int count=0;
		for(int i='a';i<='z';i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==ch[j])
				{
					count++;
					j=n;
				}
			}
		}
		if(count==26)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
