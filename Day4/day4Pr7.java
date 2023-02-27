package day4;
import java.util.*;

public class day4Pr7 {
	static int D;
	static int N;
	public static void main(String[] args)throws Exception {
		int den,numerator;
		String num;
		day4Pr7 d = new day4Pr7();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			
		System.out.println("Enter Numerator");
		num=sc.next();
		d.startsWith(num.charAt(0));
		
		
		try {
			numerator=Integer.parseInt(num);
			N=numerator;
	            
		}
		catch(Exception e)
		{
			System.out.println("Enter a number for numerator");
			continue;
			
		}
		System.out.println("Enter Denominator");
		try {
		 den=sc.nextInt();
		 D=den;
		}
		catch(Exception e)
		{
		     System.out.println("Enter a number for denominator");
		     sc.next();
		     continue;
		     
		}
		try
		{
			System.out.println("Result:"+(N/D));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter non zero denominator");
		}
		catch(Exception e)
		{
			System.out.println("Enter valid details");;
		}
		

		}
		
	}
	public  void startsWith(char c)
	{
		if(c == 'q'|| c =='Q')
		{
			System.out.println("Quiting....");
			System.exit(0);
		}
	}

}
