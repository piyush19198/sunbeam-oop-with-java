package p3;

public class Test {

	public static void main(String[] args) {
		Formula f1=new MyFormula();//up casting
		System.out.println(f1.calculate(12));
		Formula.show();
		MyFormula.show();
		MyFormula f2=new MyFormula();
		f2.show();
		
	}

}
