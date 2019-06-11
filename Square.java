import java.util.*;
import java.lang.*;
import java.io.*;
public class Square
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		int a3=sc.nextInt();
		int b3=sc.nextInt();
		int a4=sc.nextInt();
		int b4=sc.nextInt();
		if(a1==a2&&a3==a4&&b1==b4&&b2==b3)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
