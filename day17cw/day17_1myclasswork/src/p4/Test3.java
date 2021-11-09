package p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {
		// create a growable size list integers n remove all odd elements n print the list
		
		 ArrayList<Integer> list = new ArrayList<> (Arrays.asList(12,3,4,5,61,24,67,45));
		 System.out.println("Orig List");
		 list.forEach(i -> System.out.print(i+" "));
		 //API of Collection i/f
		 //default boolean removeIf(Predicate<? super T> filter)
		 //ano inner class
//		 list.removeIf(new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return t % 2 != 0;
//			}
//			 
//		});
		 //lambda expr
		 list.removeIf(t -> t % 2 != 0);
		 
		 System.out.println("\n List after remove");
		 //print the list using higher order func : forEach
		 list.forEach(i -> System.out.print(i+" "));
		 
		
	}

}
