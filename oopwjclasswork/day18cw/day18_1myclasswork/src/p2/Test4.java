package p2;

import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {
		//Create stream of ints between 1-100 & display all even elements.
		//IntStream : rangeClosed --filter --forEach
		IntStream.rangeClosed(1, 100)//IntStream : containg ints 1---100
		.filter(i -> i % 2 ==0)//IntStream : even nos (filter => intermediate op)
		.forEach(System.out::println);//terminal op

	}

}
