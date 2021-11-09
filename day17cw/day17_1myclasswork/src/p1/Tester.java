package p1;

public class Tester {

	public static void main(String[] args) {
		Formula[] formulae= {new MyFormula(),new AnotherFormula()};//up casting
		for(Formula f:formulae)
		{
			System.out.println(f.sqrt(12, 13));//DMD
			System.out.println(f.calculate(10));//DMD
		}

	}

}
