package day4;
import java.util.Scanner;
public class day4Pr8 {
	public static void main(String[] args) throws Exception{
		Scanner sc =new Scanner(System.in);
		String marks;
		int m;
		int sum=0;
		int i=0;
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
	
			sum+=m;
			i++;
		}
	
		System.out.println("Total marks:"+sum);
		System.out.println("Average:"+sum/10f);
	}
	
	

}
