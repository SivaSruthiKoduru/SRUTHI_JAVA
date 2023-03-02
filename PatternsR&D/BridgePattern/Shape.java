package BridgePattern;


abstract class Shape
{
	protected DrawInterface drawinterface;
	protected Shape(DrawInterface drawinterface)
	{
		this.drawinterface=drawinterface;
	}
	public abstract void Draw();
}