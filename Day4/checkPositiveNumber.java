package day4;

class checkPositiveNumber
{
public void check(int i) throws Exception
{
	if(i<0)
	{
		throw new NotPositiveNumberException("Thrown Exception...!!");
	}
	else
	{
		System.out.println("Entered valid number...");
	}
}
}