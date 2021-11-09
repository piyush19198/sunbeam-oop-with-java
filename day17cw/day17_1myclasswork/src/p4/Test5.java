package p4;

import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

public class Test5 {

	public static void main(String[] args) {
		List<Product> list = populateData();
		// sort product as per date n display sorted list : imperative style
//		Collections.sort(list, new Comparator<Product>() {
//
//			@Override
//			public int compare(Product o1, Product o2) {
//				// TODO Auto-generated method stub
//				return o1.getManufactureDate().compareTo(o2.getManufactureDate());
//			}
//
//		});
		Collections.sort(list,(p1,p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate()));
		
		//forEach
		list.forEach(p -> System.out.println(p));

	}

}
