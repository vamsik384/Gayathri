package assignment1;

import java.util.Scanner;

public class Stringreverse 
{
	public static void main(String[] args)
	{
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		str=s.next();
		int l=str.length();
		char a[]=str.toCharArray();
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		s.close();
	}

}
