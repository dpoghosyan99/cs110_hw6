import shapes.Square;
import shapes.Rectangle;
import utils.Math;

public class Driver {
	
	public static void main(String [] args) {
		
		Square square = new Square (100);
		Rectangle rect = new Rectangle (50, 80);
		
		System.out.println(square.getArea());
		System.out.println(rect.getArea());
		
		double number = 15.6;
		System.out.println(Math.factorial((int) number));
		System.out.println(Math.factorialLoop((int) number));
	}
	
}