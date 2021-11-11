package tester;

public class TestCheckedException2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Before");
		Thread.sleep(2000);// javac FORCES handling of the checked exc : InterruptedException
		System.out.println("After");

	}

}