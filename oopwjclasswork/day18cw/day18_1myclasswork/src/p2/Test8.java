package p2;

import java.util.stream.IntStream;

public class Test8 {

	public static void main(String[] args) {
		// Display average of all odd nos between 1-100 .
			//src --filter --average --get
		double avg=IntStream.rangeClosed(10, 10).filter(i -> i %2 != 0).average().getAsDouble();
		System.out.println("Avg "+avg);

	}

}
