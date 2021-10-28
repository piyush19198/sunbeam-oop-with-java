package tester;

public class TestCheckedExcception {

	public static void main(String[] args) {
		try {
			System.out.println("Before");
			Thread.sleep(2000);// javac FORCES handling of the checked exc : InterruptedException
			System.out.println("After");
		} catch (InterruptedException e) {
			System.out.println("error " + e);
		}
	}

}