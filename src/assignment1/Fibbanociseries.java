package assignment1;

import java.util.Scanner;

public class Fibbanociseries 
{
	public static void main(String[] args) 
	{
		int a,b=0,c=1,d,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number upto which fibbanoci series is to be printed");
		a=s.nextInt();
		System.out.print(b);
		System.out.print(" ");
		System.out.print(c);
		System.out.print(" ");
		for(i=2;i<=a;i++)
		{
			d = b+c;
			System.out.print(d);
			System.out.print(" ");
			b=c;
			c=d;
		}
		
	}

}
