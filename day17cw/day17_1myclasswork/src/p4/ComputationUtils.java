package p4;

public class ComputationUtils {
//add a static method to ret result of ANY operation performed on 2 double operands
	static double performAnyOperation(double a,double b,Computable operation)
	{
		return operation.compute(a, b);
	}
}
