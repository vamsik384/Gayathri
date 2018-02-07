package assignment1;

import java.util.Scanner;

public class Palindrome
{
	static int a,b,c,sum=0;
	public static void main(String[]args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		a=s.nextInt();
		c=a;
		//System.out.println("number:"+ a);
		while(a>0)
		{
			b=a%10;
			sum=sum*10+b;
			a=a/10;
			
		}
		if(c==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		
		}
	}

}
