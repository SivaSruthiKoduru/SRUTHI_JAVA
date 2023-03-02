package FlyWeightPattern;
import java.util.HashMap;
public class FlyWeightPatternDemo {
	private static final String colours[]= {"red","green","blue","pink","purple"};
	public static void main(String[] args)
	{
		for(int i=0;i<20;i++)
		{
			Circle circle=(Circle)ShapeFactory.getCircle(getRandomColour());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
			
		}
	}
	private static String getRandomColour()
	{
		return colours[(int)(Math.random()*colours.length)];
	}
	private static int getRandomX()
	{
		return (int)(Math.random()*100);
	}
	private static int getRandomY()
	{
		return (int)(Math.random()*100);
	}

}
interface Shape
{
	void draw();
	
}
class Circle implements Shape
{
private int x;
private int y;
private String colour;
private int radius;
public Circle(String colour)
{
	this.colour=colour;
	
}
public void setX(int x)
{
	this.x=x;
	
}
public void setY(int y)
{
	this.y=y;
}
public void setRadius(int radius)
{
	this.radius=radius;
}
public void draw()
{
	System.out.println("Drawing circle with\ncolour:"+colour+"\nx:"+x+"\ny:"+y+"\nRadius:"+radius+"\n\n\n");
}
	
}
class ShapeFactory
{
	private static final HashMap<String,Shape> circleMap=new HashMap<>();
	public static Shape getCircle(String colour)
	{
		Circle circle=(Circle)circleMap.get(colour);
		if(circle==null)
		{
			circle = new Circle(colour);
			circleMap.put(colour, circle);
			System.out.println("Creating circle of colour:"+colour);
		}
		return circle;
	}
}

