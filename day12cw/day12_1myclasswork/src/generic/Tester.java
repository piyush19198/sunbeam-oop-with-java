package generic;

public class Tester {

	public static void main(String[] args) {
		// create a holder class instance to hold int value
		//any impl conversion ? int ---> Integer : auto boxing
		Holder<Integer> h1 = new Holder<>(12345);// diamond operator : deducing the type of RHS from LHS generic type
		int data=h1.getO();//impl conversion : Integer ---> int : auto un boxing
		// create a holder class instance to hold a string data
		Holder<String> h2=new Holder<>("23413");//impl conversion : NONE!
		String s=h2.getO();
		

	}

}