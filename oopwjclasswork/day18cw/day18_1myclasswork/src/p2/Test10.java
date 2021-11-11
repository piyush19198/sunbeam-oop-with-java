package p2;

import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;

public class Test10 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * 8. Display sum of product(list) prices of a specific category. I/P category
			 * name o/p average price
			 */
			// list --stream() --filter --Stream<Product> --mapToDouble --avg --getAsDouble
			List<Product> list = populateData();
			System.out.println("All products ");
			list.forEach(System.out::println);
			System.out.println("Enter category");
			Category cat = Category.valueOf(sc.next().toUpperCase());
			double avgPrice=list.stream(). // src
					filter(p -> p.getProductCatgeory() == cat). // filtered Stream<Product>
					mapToDouble(Product::getPrice).// DoubleStream
					average().orElse(0);
			System.out.println("Avg price of products under Category "+cat +" : "+avgPrice);

		}

	}

}
