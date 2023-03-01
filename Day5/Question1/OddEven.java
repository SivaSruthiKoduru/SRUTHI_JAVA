package Question1;

class OddEven
{
	static int i=1;
	static int j=1;
	 public void printOdd()
	{
		while(i<=100)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			
			i++;
			
		}
	}
	 public void printEven()
	{
		while(j<=100)
		{
			if(j%2==0)
			{
				System.out.print(j+" ");
			}
			
			
			j++;
			
		}
		}
	}