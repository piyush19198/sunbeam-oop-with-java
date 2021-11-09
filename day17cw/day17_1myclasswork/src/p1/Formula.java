package p1;

interface Formula {
	double calculate(double a);//javac adds :  public n abstract
	//javac implicitly add : public 
	default double sqrt(double a, double b) {
		System.out.println("3");
		return Math.sqrt(a + b);
	}
}