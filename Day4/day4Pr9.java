package day4;
import java.util.Scanner;
public class day4Pr9{
	public static void main(String[] args) throws Exception{
		Scanner sc =new Scanner(System.in);
		String marks;
		int m;
		int sum=0;
		int i=0;
		day4Pr9 day = new day4Pr9();
		while(i<10)
		{
			
			System.out.println("Enter student "+(i+1)+" marks");
			marks=sc.next();
			try
			{
				m=Integer.parseInt(marks);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Please enter a valid number");
				continue;
			}
			
			catch(Exception e)
			{
				System.out.println("Enter a valid number");
				continue;
			}
			
			try
			{
				day.check(m);
			}
			catch(NegativeNumberException e)
			{
				System.out.println("Please enter a positive number");
				continue;
			}
			catch(MarksOutOfRangeException e)
			{
				System.out.println("Please enter number less than 100");
				continue;
			}
	
			sum+=m;
			i++;
		}
	
		System.out.println("Total marks:"+sum);
		System.out.println("Average:"+sum/10f);
	}
	public void check(int m) throws Exception
	{
		if(m<0)
		{
			throw new NegativeNumberException("Negative number exception occured");
		}
		else if(m>100)
		{
			throw new MarksOutOfRangeException("Marks out of range exception occured");
		}
	}
	
	

}