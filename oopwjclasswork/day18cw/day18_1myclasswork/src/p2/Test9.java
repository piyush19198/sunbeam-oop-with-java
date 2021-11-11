package p2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Test9 {

	public static void main(String[] args) {
		// Display average of all odd nos between user specified range
		// in case of empty stream : display 0
		// src --filter --average --get
		try (Scanner sc = new Scanner(System.in)) {
			int strt = sc.nextInt();
			int end = sc.nextInt();

			double avg = IntStream.rangeClosed(strt, end).filter(i -> i % 2 != 0).average().orElse(0);
			System.out.println("Avg " + avg);
		}

	}

}
