package assignment1;

import java.util.Scanner;

public class swaping 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number:" );
		a=s.nextInt();
		System.out.println("enter second number:");
		b=s.nextInt();
		System.out.println("numbers before swapping:" + a +" "+ b);
		
		a=a+b;
		
		b=a-b;
		a=a-b;
		
		System.out.println("numbers after swapping:" + a +" "+ b);
		
		
	}

}
