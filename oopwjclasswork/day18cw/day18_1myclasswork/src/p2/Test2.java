package p2;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// 1.Create int[] ---> IntStream & display its contents(forEach) : in a single
		// line
		int[] data = { 23, 1, 20, -12, 45, 123, 20, -10, 67, 78 };
		System.out.println("Printing contents");
		Arrays.stream(data).// IntStream
				forEach(System.out::println);//terminal op.
	}

}
