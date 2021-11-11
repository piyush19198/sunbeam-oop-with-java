package p1;

public class AnotherFormula implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("2");
		return a/2;
	}
	//can imple class override inherited def method imple ? YES
	@Override
	public double sqrt(double a, double b) {
		return Math.sqrt(a * b);
	}
	

}
