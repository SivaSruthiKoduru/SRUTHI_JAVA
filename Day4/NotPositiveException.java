package day4;

class NotPositiveException extends Exception
{
	String msg;
	public NotPositiveException(String msg)
	{
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
}
