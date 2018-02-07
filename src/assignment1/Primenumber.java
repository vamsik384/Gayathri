package assignment1;

import java.util.Scanner;

public class Primenumber 
{
	static int a;
	static int b,i;
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a numer");
		a=s.nextInt();
		System.out.println("number:" + a);
		for(i=2;i<a;i++)
		{
			b=0;
			if(a%i==0) 
			{
				b++;
				break;	
			}			
		}
		if(b==0)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
		
	}

}
