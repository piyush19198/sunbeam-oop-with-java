package non_generic;

public class Tester {

	public static void main(String[] args) {
		// create a holder class instance to hold int value
		Holder h1 = new Holder(100);// int -->Integer(auto boxing) ---> Object(up casting)
		int data = (Integer) h1.getReference();// explicit down casting (prog) Object---> Integer --> impl conversion :
												// auto unboxing(Integer-->int) : javac
		
		// create a holder class instance to hold a string data
		Holder h2=new Holder("123456");//String ---> Object : up casting : javac
		String s=(String)h2.getReference();//explicit down casting (prog) Object--->String
		h1=h2;
		data = (Integer) h1.getReference();//class cast exc : String can't be cast into Integer
		System.out.println(data);
	}

}
