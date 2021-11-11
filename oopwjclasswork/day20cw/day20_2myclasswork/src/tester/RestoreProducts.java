package tester;

import java.util.Scanner;
import static utils.DeSerIOUtils.restoreProducts;

public class RestoreProducts {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			System.out.println(restoreProducts(sc.nextLine()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
