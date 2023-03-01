package Question6;

class NotAnAlphaException extends Exception
{
	String msg;
	public NotAnAlphaException(String msg)
	{
		super(msg);
		this.msg=msg;
	}
}
