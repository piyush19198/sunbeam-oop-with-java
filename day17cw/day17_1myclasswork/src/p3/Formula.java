package p3;

interface Formula {
	double calculate(double a);//javac adds :  public n abstract
	//javac implicitly add : public 
	default double sqrt(double a, double b) {
		System.out.println("3");
		return Math.sqrt(a + b);
	}
	//can you add a static method in the i/f ? YES
	//implicit keyword added by javac : public
	static void show()
	{
		System.out.println("in static method of the i/f");
	}
}