package assignment1;

import java.util.Scanner;

public class powerof2
{
	static int i,j,k,l;
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		j=s.nextInt();
		for(i=1;i<=j;i++)
		{
			l=0;
			k=(int) Math.pow(2, i);
			if(j==k)
			{
				l++;
				break;
			}
			
		}
		//System.out.println(k);
		if(l==1)
		{
			System.out.println("number is power of 2");
		}
		else
		{
			System.out.println("number is not power of 2");
			
			
		}
		s.close();
	}

}
