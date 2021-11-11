package p2;

import java.util.Arrays;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		// Create IntStream from a fixed size list (un sorted ) of integers , sort n display it.
		//List --stream() -- sorted() -- forEach
		List<Integer> list = Arrays.asList(23, 1, 20, -12, 45, 123, 20, -10, 67, 78);
		list.stream(). //src : Stream<Integer>
		sorted().//intermediate stateful op Stream<Integer> : sorted as per Natural ordering
		forEach(i -> System.out.print(i+" "));
		
	}

}
