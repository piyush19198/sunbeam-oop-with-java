package p1;
import static utils.CollectionUtils.populateData;

import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

import static java.util.Comparator.comparing;

public class Test {

	public static void main(String[] args) {
		//get populated product list from utils
		List<Product> list = populateData();
		//sort products as per manufacture date : asc manner
		//List i/f method
		//public default void sort(Comparator<T> comp) 
		//lambda expression w/o using comparing method
//		Comparator<Product> comp=(p1,p2)->p1.getManufactureDate().compareTo(p2.getManufactureDate());
//		list.sort(comp);
//		list.forEach(System.out::println);
		//OR : in a simpler manner : completely optional
//		Comparator<Product> comp=comparing(product -> product.getManufactureDate());
//		list.sort(comp);
//		list.forEach(System.out::println);
		//comparing + method ref
		
		Comparator<Product> comp=comparing(Product :: getManufactureDate);
		list.sort(comp);
		list.forEach(System.out::println);
		

	}

}
