package p2;

import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;

import static utils.CollectionUtils.populateData;


public class Test6 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			List<Product> list = populateData();
			System.out.println("Orig List");
			list.forEach(System.out::println);
			System.out.println("Enter category n price");
			Category category=Category.valueOf(sc.next().toUpperCase());
			double price=sc.nextDouble();
		/*
		 * Display all product names of a particular category , exceeding specific
		 * price. I/P category name & price. (stream,filter,forEach) eg : productList :
		 * List<Product>
		 */
			System.out.println("Product Names under category "+category+" having price > "+price);
		//list --stream() --filter--forEach
			list.stream(). //Stream<Product> :all
			filter(p -> p.getProductCatgeory()==category). //intermediate stateless op
			filter(p -> p.getPrice() > price).//intermediate stateless op
			forEach(p -> System.out.println(p.getName()));//terminal op.
			
			
		}

	}

}
