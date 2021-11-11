package p4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test2 {

	public static void main(String[] args) {
		// create a fixed size list integers n display it using INTERNAL iteration : forEach : higher order func
		//why it's a higher order func : since the method arg : is a func i/f
		//Func i/f represent SAM or a specific behavior.
		List<Integer> list = Arrays.asList(12,3,4,5,61,24,67,45);
		//use ano innner class
		//API of Iterable
		//default void forEach(Consumer<? super T> action)
//		list.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//				
//			}		
//			
//		});
		System.out.println("list contents via lambda expr");
		list.forEach(i -> System.out.println(i));
		
		

	}

}
