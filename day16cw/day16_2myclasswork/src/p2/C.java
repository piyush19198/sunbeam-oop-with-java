package p2;

public class C implements A, B {
	@Override
	public void show() {
		System.out.println("in show : abstract method imple.");
	}

	// javac forces the imple. class to override duplicate def. method imple.
	@Override
	public double add(double a, double b) {
		System.out.println(3);
		A.super.add(3,4);
		B.super.add(4, 5);
		return a * a * a + b * b * b;
	}
}
