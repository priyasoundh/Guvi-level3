import java.util.*;
import java.lang.*;
import java.io.*;
public class Tournament
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		while(a<=n)
		{
			a=2*a;
		}
		a=n-(a/2);
		System.out.println(a);
	}
}
