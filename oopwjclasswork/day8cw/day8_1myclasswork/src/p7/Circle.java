package p7;

public class Circle extends BoundedShape{
	private double radius;
	

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		return PI*radius*radius;
	}

	@Override
	public double computePerimeter() {
		return 2*PI*radius;
	}

	@Override
	public String toString() {
		return "Circle "+super.toString()+" radius=" + radius;
	}

	public void drawArc(int i) {
		
	}
}