package p2;

import java.util.stream.IntStream;

public class Test7 {

	public static void main(String[] args) {
		// Display sum of all even nos between 1-100 .
		//src --filter--specialized reduction : sum
		int sum=IntStream.range(1, 101).//IntStream : 1---100
		filter(i -> i %2 == 0).//IntStream : filtered even nos bet 1-100
		sum();
		System.out.println("Sum "+sum);	
		

	}

}
