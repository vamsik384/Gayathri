package assignment;

public class SubjectMarks 
{
	static String s0,s1,s2,s3,s4,s5,s6,s7,s8,s9;
	static int totalsum; 
	static double percentage;
	static int a,b,c,d,e,f,g,h,i,j;
	public static void main(String[] args)
	{
		s0="telugu";
		s1="English";
		s2="sanskrit";
		s3="Hindi";
		s4="Maths";
		s5="Physics";
		s6="Chemistry";
		s7="Science";
		s8="Computers";
		s9="Social";
		a=77;
		b=67;
		c=57;
		d=47;
		e=97;
		f=97;
		g=64;
		h=87;
		i=93;
		j=91;
		System.out.println(s0 +":" + a);
		System.out.println(s1 +":" + b);
		System.out.println(s2 +":" + c);
		System.out.println(s3 +":" + d);
		System.out.println(s4 +":" + e);
		System.out.println(s5 +":" + f);
		System.out.println(s6 +":" + g);
		System.out.println(s7 +":" + h);
		System.out.println(s8 +":" + i);
		System.out.println(s9 +":" + j);
		totalsum=a+b+c+d+e+f+g+h+i+j;
		System.out.println("TotalMarks:" + totalsum);
		
	}
}