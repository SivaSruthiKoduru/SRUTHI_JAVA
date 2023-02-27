package day4;

public class day4Pr2 {
	public void mth1()
	{
		mth2();
		System.out.println("caller");
	}
	public void mth2()
	{
		try
		{
			int i=2/0;
			return;
			
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
		day4Pr2 s = new day4Pr2();
		s.mth1();
	}

}
