package BridgePattern;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redcircle=new Circle(10,100,109,new RedCircle());
		Shape greencircle=new Circle(10,67,19,new GreenCircle());
		redcircle.Draw();
		greencircle.Draw();
	}

}



