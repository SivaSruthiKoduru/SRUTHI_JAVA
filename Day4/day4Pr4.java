package day4;
import java.util.Scanner;

public class day4Pr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int i=sc.nextInt();
		checkPositive c = new checkPositive();
		try
		{
			c.check(i);
		}
		catch(NotPositiveException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}


