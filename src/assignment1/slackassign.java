package assignment1;

import java.util.Scanner;

public class slackassign 
{
	//static String str= "Hi, Here is your joining year 2017";
	public static void main(String[] args) 
	{
		
		/*String str1 = str.substring(0, 30);
		System.out.println(str1);
		String Str2 = str.substring(30, 34);
		System.out.println(Str2);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String a = sc.nextLine();
		int l = a.length();
		System.out.println("the length of string is"+l);
		char b[]=a.toCharArray();
		for(int i = 0;i<l;i++) 
		{
			int c=(int)b[i];
			if((c>=65&&c<=90)||(c>=97&&c<=122)||(c>=32&&c<=32)) {
			System.out.print(b[i]);	
			}
			
		}
		
	}

}

