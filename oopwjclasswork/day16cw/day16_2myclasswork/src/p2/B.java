package p2;

public interface B {
	void show();

	default double add(double a, double b) {
		System.out.println(2);
		return a*a + b*b;
	}
}
