package tester;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter int");
			System.out.println("You entered : " + sc.nextInt());
			System.out.println("end of try");
		} catch (Exception e) {
			System.out.println("err "+e);
		}
		finally {
			System.out.println("Closing scanner");
			sc.close();
		}
		System.out.println("main over...");

	}

}