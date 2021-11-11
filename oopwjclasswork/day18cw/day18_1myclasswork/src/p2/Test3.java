package p2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 2. Create AL<Integer> , populate it. 
		 *     Convert it to seq stream & display elems
		 */
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(23, 1, 20, -12, 45, 123, 20, -10, 67, 78));
		System.out.println("seq stream ");
		list.stream() //sequential Stream<Integer>
		.forEach(i -> System.out.print(i+" "));
		System.out.println("parallel stream");
		list.parallelStream() //parallel Stream<Integer>
		.forEach(i -> System.out.print(i+" "));

	}

}
