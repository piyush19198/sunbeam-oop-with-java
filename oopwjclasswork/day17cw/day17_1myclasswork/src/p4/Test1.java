package p4;

import static p4.ComputationUtils.performAnyOperation;

public class Test1 {

	public static void main(String[] args) {
		// add 2 numbers
		System.out.println("Addition " + performAnyOperation(10, 20, new Adder()));
		// subtract 2 numbers : any better way that creating a separate class that imple
		// Computable : YES : ano inner class
		System.out.println("Subtraction " + performAnyOperation(100, 20, new Computable() {

			@Override
			public double compute(double d1, double d2) {
				// TODO Auto-generated method stub
				return d1 - d2;
			}
		}));
		// multiply 2 numbers
//		System.out.println("Product  " + performAnyOperation(100, 20, new Computable() {
//
//			@Override
//			public double compute(double d1, double d2) {
//				// TODO Auto-generated method stub
//				return d1 * d2;
//			}
//		}));
		//multiply 2 numbers : using a lambda expression 
		//syntax : (method args) -> body
		System.out.println("Product  " + performAnyOperation(100, 20,
				(double c,double d) -> {return c * d;} ));
		//OR : more concise form of the lambda expression
		System.out.println("Product  " + performAnyOperation(100, 20,(c,d)->c*d));
		//divide 2 numbers : lambda expression
		System.out.println("Division " + performAnyOperation(100, 20,(c,d)->c/d));
	}

}
