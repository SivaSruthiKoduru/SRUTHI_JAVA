package Question6;
class NotACharException extends Exception
{
	String msg;
	public NotACharException(String msg)
	{
		super(msg);
		this.msg=msg;
		
	}

}
