package day4;

public class day4Pr3 {
	public void mth1()
	{
		mth2();
		System.out.println("caller");
	}
	public void mth2()
	{
		try
		{
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	public static void main(String[] args) {
		day4Pr3 s = new day4Pr3();
		s.mth1();
	}

}
