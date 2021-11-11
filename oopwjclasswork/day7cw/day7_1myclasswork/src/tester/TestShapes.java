package tester;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class TestShapes {

	public static void main(String[] args) {
		BoundedShape[] shapes= {new Circle(10,20,10.5),new Rectangle(50, 100, 20, 12.56)};
		for(BoundedShape s:shapes) {
			System.out.println(s);
			System.out.println("Area"+s.area());
		}
	}
}
