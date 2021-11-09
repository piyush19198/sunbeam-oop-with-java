package p1;

public class MyFormula implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("1");
		return a*2;
	}
	

}
