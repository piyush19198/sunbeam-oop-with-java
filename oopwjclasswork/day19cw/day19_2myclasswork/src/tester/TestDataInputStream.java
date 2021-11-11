package tester;

import java.util.Scanner;
import static utils.BinIOUtils.restoreProductDetails;

public class TestDataInputStream {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name to restore data");
			System.out.println(restoreProductDetails(sc.next()));
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
