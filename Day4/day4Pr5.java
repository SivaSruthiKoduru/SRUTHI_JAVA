package day4;
import java.util.Scanner;

public class day4Pr5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int i=sc.nextInt();
		checkPositiveNumber c = new checkPositiveNumber();
		try
		{
			c.check(i);
		}
		
		
	}

}


