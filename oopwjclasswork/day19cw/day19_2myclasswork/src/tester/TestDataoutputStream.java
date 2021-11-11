package tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;
import static utils.BinIOUtils.storeProductDetails;

public class TestDataoutputStream {

	public static void main(String[] args) {
		// accept product details from user n store it in a bin file
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(
					"Enter product details :  id,  name,  productCatgeory,  manufactureDate(yr-mon-day),  price");
			Product p = new Product(sc.nextInt(), sc.next(), Category.valueOf(sc.next().toUpperCase()),
					LocalDate.parse(sc.next()), sc.nextDouble());
			System.out.println("Enter file name");
			storeProductDetails(p, sc.next());
			System.out.println("product details stored....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
