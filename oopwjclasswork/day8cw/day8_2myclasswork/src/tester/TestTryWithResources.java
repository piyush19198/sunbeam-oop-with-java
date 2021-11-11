package tester;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {
		// try-with-resources
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter int");
			System.out.println("You entered : " + sc.nextInt());
			System.out.println("end of try");
		}
		 catch (Exception e) {
			System.out.println("err " + e);
		}

		System.out.println("main over...");

	}

}