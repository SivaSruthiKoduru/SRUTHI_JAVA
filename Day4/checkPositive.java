package day4;

class checkPositive
{
public void check(int i) throws Exception
{
	if(i<0)
	{
		throw new NotPositiveException("Thrown Exception...!!");
	}
	else
	{
		System.out.println("Entered valid number...");
	}
}
}