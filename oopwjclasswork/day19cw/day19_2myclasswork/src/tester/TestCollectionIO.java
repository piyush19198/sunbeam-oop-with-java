package tester;

import static utils.CollectionUtils.*;
import static utils.IOUtils.storeProductDetails;

import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;

public class TestCollectionIO {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated product list from utils
			List<Product> list = populateData();
			System.out.println("Enter product category");
			Category category = Category.valueOf(sc.nextLine().toUpperCase());
			System.out.println("Enter file name to store products");
			String fileName=sc.nextLine();
			storeProductDetails(filterAndSortProducts(list, category), fileName); 
			System.out.println("product stored...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
