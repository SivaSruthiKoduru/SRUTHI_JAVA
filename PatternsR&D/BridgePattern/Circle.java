package BridgePattern;

class Circle extends Shape
{
	int x,y,radius;
	public void Draw() {
		
		drawinterface.drawCircle(radius, x, y);
	}
	public Circle(int x,int y,int radius,DrawInterface drawinterface)
	{
		super(drawinterface);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
}