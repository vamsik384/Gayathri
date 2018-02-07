package assignment1;

import java.util.Scanner;

public class squareofnumber 
{
	static int a,b,i,c;
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			c=0;
			b=i*i;
			if(a==b)
			{
				c++;
				break;
			}
		}
		if(c==1)
		{
			System.out.println("number is power of 2");
		}
		else
		{
			System.out.println("number is not power of 2");
		}
	}

}
