package test_static;
//To access ALL static members  of the System class directly (w/o using class name)
import static java.lang.System.*;
import static java.lang.Math.sqrt;
import static java.lang.System.exit;

public class Test1 {

	private int i;
	
	private static int j;

	public static void main(String[] args) {

		out.println(j);
		System.out.println(i);
		show();
		exit(0);
		System.out.println(sqrt(12.34));

	}
	
	public static void show()
	{
		
		System.out.println("instance var "+i);
		System.out.println("static var "+j);
		
		Test1 t1=new Test1();
		System.out.println(t1.i);
		
		System.out.println(this);
		System.out.println(super);
	}

	public void testMe()
	{
		System.out.println(i+" "+j);
		show();
	}

}