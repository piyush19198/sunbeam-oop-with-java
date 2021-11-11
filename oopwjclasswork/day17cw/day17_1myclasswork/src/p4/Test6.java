package p4;

import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

public class Test6 {

	public static void main(String[] args) {
		List<Product> list = populateData();
		// sort product as per date n display sorted list : imperative style : using
		// function literal
		int data = 1234;// int literal
		String s = "hello";// literal string
		// Func programming style => it treats functions as the 1st class citizens
		// Functions can be passed as method arg or can be returned
		// Can you assign entire func def. to a variable ? YES
		Comparator<Product> productComp = (p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate());
		Collections.sort(list,productComp);
		// Collections.sort(list,(p1,p2) ->
		// p1.getManufactureDate().compareTo(p2.getManufactureDate()));

		// forEach
		list.forEach(p -> System.out.println(p));

	}

}
