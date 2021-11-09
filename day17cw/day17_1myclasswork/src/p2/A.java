package p2;

public interface A {
	void show();

	default double add(double a, double b) {
		System.out.println(1);
		return a + b;
	}
}
