package tester;

public class Test1 {

	public static void main(String[] args) {
		try {
			int result = 23 / 10;
			System.out.println("res " + result);
			int[] data = { 10, 20, 30, 40 };
			System.out.println("array data " + data[0]);//AOB exc
			System.out.println("Parsed int value " + Integer.parseInt("dsf345"));// NFExc : un chked exc : javac DOES
																					// NOT
																					// force handling of the un chked
																					// excs.
			System.out.println("end of try");
		} catch (ArithmeticException e) {
			System.out.println(1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
			System.out.println("Err Message "+e.getMessage());
			System.out.println("More details "+e);
			System.out.println("Stack trace : ");
			e.printStackTrace();
		}
		System.out.println("main continues....");
	}

}