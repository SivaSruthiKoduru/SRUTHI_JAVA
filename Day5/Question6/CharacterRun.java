package Question6;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CharacterRun{
	public static void main(String[] args) throws Exception
	{
		Scanner scanner = new Scanner(System.in);
		CheckAlphaClass checkalphaclass = new CheckAlphaClass();
		ExecutorService executorservice = Executors.newFixedThreadPool(1);
		executorservice.execute(()->
		{
			while(true)
			{
				try {
					checkalphaclass.checkAlphaMethod();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
	}
	
}
class CheckAlphaClass
{
	static int i=0;
	Scanner scanner  = new Scanner(System.in);
	public void checkAlphaMethod() throws Exception
	{
		System.out.println("Enter an alphabet:");
		String str=scanner.next();
		try 
		{
			checkChar(str);
			i++;
			System.out.println("Alpha count="+i);
		}
		catch(NotACharException e)
		{
			System.out.println("Please enter a single character...");
		}
		catch(NotAnAlphaException e)
		{
			System.out.println("Please enter an alphabet...");
		}		
   }
	public void checkChar(String str) throws Exception
	{
		char c=str.charAt(0);
		if(str.length()>=2)
		{
			throw new NotACharException("Not a character exception caught....");
		}
		else if(isNotAlpha(c))
		{
			throw new NotAnAlphaException("Not an alphabet exception caught...");
		}		
	}
	public boolean isNotAlpha(char c)
	{
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			return false;
		}
		else
		{
		return true;
		}
	}
}



