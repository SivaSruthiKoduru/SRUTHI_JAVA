package Question2;

class DisplayMessage
{
	

	public void display(String msg)
	{
		System.out.print("\"[------"+msg+"------]\"\n");
		try 
		{
			Thread.sleep(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

