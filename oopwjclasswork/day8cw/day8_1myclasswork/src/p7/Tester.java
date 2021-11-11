package p7;

public class Tester {

	public static void main(String[] args) {
		//BoundedShape[] shapes= {new Circle(10, 20, 10.56),new Rectangle(20, 40, 10, 13)};
		Computable[] computables={new Circle(10, 20, 10.56),new Rectangle(20, 40, 10, 13)};
		for(Computable c:computables) {
			System.out.println(c);
			System.out.println("Area: "+c.computeArea()+" Perimeter: "+c.computePerimeter());
			if (c instanceof Circle)
				((Circle) c).drawArc(50);
			else
				System.out.println("Can't draw arc : Not a Circle!!!!!");		}
	}
}