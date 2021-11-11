package p3;

public class MyFormula implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("must imple abstract method");
		return 0;
	}

	@Override
	public double sqrt(double a, double b) {
		System.out.println("in overriding form of def method");
		return Math.sqrt(a*b);
	}
//	@Override
//	public static void show()
//	{
//		System.out.println("can't override static methods of i/f");
//	}
	//re-declaring static method
	 static void show()
	{
		System.out.println("re-declaring static method");
	}

}
