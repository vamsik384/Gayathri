package assignment1;

import java.util.Scanner;

public class OddEven
{
	static int a;
	public static void main(String [] args)
	{
	
	
		Scanner s=new Scanner(System.in); 
		System.out.println("enter a number");
		a=s.nextInt();
		System.out.println("number:" + a);
		if (a%2==0)
		{
			System.out.println("it is an even number");
			
		}
		else
		{
			System.out.println("it is an odd number");
		}
		s.close();
	
	}

}
