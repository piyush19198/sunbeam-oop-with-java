package nested_classes;

public class Outer {
//can outer class contain static / non static : YES
	private int i;
	private static int j;
	static {
		j = 100;
	}

	public Outer(int i) {
		this.i = i;
	}
	// static method
	public static void test1() {
		System.out.println("outer's static method " + j);
	//	Inner in=new Inner(3456);
		Outer.Inner in=new Outer(11).new Inner(22);
		System.out.println(in.l);
		
	}

	// non static method
	public void test2() {
		//can outer class DIRECTLY(w/o instantiation) access inner cls members ? NO
	//	System.out.println("outer's non-static method " + i + " " + j+" "+k+" "+l);
		//test2: non static method : is implictiyl asso with "this" 
		Inner in=new Inner(1234);
		System.out.println("outer's non-static method "+Inner.k+" "+in.l);
	}

	// non static nested class : inner class
	class Inner {
		// can inner class contain static members or static init blocks ? NO (JDK 1.8
		// onwards : static final : allowed)
		// private static int k;
		private static final int k = 100;
//		static {
//			
//		}
		private int l;// can declare non static data member

		public Inner(int l) {// can add ctor/s
			this.l = l;
		}

		// can u add static methods in innner class ? NO
//		public static void test3()
//		{
//			
//		}
		// can u add non static method in the inner class ? YES
		public void test4() {
			// can inner class access outer class's members DIRECTLY (i.e w/o creating
			// instance of the outer class) : YES
			System.out.println("inner's non static method " + i + " " + j + " " + k + " " + l);
		}

	}

}
